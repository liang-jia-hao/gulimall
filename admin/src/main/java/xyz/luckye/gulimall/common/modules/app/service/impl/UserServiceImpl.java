/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package xyz.luckye.gulimall.common.modules.app.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.luckye.gulimall.common.exception.RRException;
import xyz.luckye.gulimall.common.validator.Assert;
import xyz.luckye.gulimall.common.modules.app.dao.UserDao;
import xyz.luckye.gulimall.common.modules.app.entity.UserEntity;
import xyz.luckye.gulimall.common.modules.app.form.LoginForm;
import xyz.luckye.gulimall.common.modules.app.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public UserEntity queryByMobile(String mobile) {
        return baseMapper.selectOne(new QueryWrapper<UserEntity>().eq("mobile", mobile));
    }

    @Override
    public long login(LoginForm form) {
        UserEntity user = queryByMobile(form.getMobile());
        Assert.isNull(user, "手机号或密码错误");

        //密码错误
        if (!user.getPassword().equals(DigestUtils.sha256Hex(form.getPassword()))) {
            throw new RRException("手机号或密码错误");
        }

        return user.getUserId();
    }
}

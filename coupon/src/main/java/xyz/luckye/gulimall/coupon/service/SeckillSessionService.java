package xyz.luckye.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.common.utils.PageUtils;
import xyz.luckye.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package xyz.luckye.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import xyz.luckye.gulimall.product.dao.BrandDao;
import xyz.luckye.gulimall.product.entity.BrandEntity;
import xyz.luckye.gulimall.product.service.BrandService;
import xyz.luckye.gulimall.common.utils.PageUtils;
import xyz.luckye.gulimall.common.utils.Query;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}
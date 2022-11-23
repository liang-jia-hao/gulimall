package xyz.luckye.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.product.entity.BrandEntity;
import xyz.luckye.gulimall.common.utils.PageUtils;

import java.util.Map;

public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


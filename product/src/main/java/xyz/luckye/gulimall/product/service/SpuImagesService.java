package xyz.luckye.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.product.entity.SpuImagesEntity;
import xyz.luckye.gulimall.common.utils.PageUtils;

import java.util.Map;

public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


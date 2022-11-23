package xyz.luckye.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.product.entity.AttrAttrgroupRelationEntity;
import xyz.luckye.gulimall.common.utils.PageUtils;

import java.util.Map;

public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


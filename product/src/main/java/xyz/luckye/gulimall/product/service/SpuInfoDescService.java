package xyz.luckye.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.product.entity.SpuInfoDescEntity;
import xyz.luckye.gulimall.common.utils.PageUtils;

import java.util.Map;

public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


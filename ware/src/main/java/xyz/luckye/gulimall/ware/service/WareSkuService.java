package xyz.luckye.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.common.utils.PageUtils;
import xyz.luckye.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


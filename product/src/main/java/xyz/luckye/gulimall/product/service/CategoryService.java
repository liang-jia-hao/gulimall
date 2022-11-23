package xyz.luckye.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.product.entity.CategoryEntity;
import xyz.luckye.gulimall.common.utils.PageUtils;

import java.util.Map;

public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


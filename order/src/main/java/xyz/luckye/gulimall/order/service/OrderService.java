package xyz.luckye.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.common.utils.PageUtils;
import xyz.luckye.gulimall.order.entity.OrderEntity;

import java.util.Map;

public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


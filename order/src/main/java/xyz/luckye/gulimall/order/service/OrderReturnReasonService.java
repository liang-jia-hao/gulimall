package xyz.luckye.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.common.utils.PageUtils;
import xyz.luckye.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


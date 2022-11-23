package xyz.luckye.gulimall.order.dao;

import xyz.luckye.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}

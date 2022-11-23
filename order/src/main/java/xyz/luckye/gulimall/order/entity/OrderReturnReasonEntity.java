package xyz.luckye.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Data;

@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity {

    // id
    @TableId
    private Long id;
    // 退货原因名
    private String name;
    // 排序
    private Integer sort;
    // 启用状态
    private Integer status;
    // create_time
    private Date createTime;

}
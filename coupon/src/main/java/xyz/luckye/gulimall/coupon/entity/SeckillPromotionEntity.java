package xyz.luckye.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Data;

@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity {

    // id
    @TableId
    private Long id;
    // 活动标题
    private String title;
    // 开始日期
    private Date startTime;
    // 结束日期
    private Date endTime;
    // 上下线状态
    private Integer status;
    // 创建时间
    private Date createTime;
    // 创建人
    private Long userId;

}
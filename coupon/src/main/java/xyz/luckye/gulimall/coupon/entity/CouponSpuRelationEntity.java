package xyz.luckye.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Data;

@Data
@TableName("sms_coupon_spu_relation")
public class CouponSpuRelationEntity {

    // id
    @TableId
    private Long id;
    // 优惠券id
    private Long couponId;
    // spu_id
    private Long spuId;
    // spu_name
    private String spuName;

}

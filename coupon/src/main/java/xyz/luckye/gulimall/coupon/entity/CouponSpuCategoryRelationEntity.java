package xyz.luckye.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Data;

@Data
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity {

    // id
    @TableId
    private Long id;
    // 优惠券id
    private Long couponId;
    // 产品分类id
    private Long categoryId;
    // 产品分类名称
    private String categoryName;

}

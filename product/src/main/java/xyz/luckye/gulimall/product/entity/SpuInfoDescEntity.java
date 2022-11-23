package xyz.luckye.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity {

    // 商品id
    @TableId
    private Long spuId;
    // 商品介绍
    private String decript;

}

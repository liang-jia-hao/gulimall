package xyz.luckye.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
@TableName("pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationEntity {

    // id
    @TableId
    private Long id;
    // 属性id
    private Long attrId;
    // 属性分组id
    private Long attrGroupId;
    // 属性组内排序
    private Integer attrSort;

}

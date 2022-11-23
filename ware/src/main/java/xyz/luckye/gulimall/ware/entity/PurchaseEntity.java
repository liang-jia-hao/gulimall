package xyz.luckye.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
@TableName("wms_purchase")
public class PurchaseEntity {

    @TableId
    // 
    private Long id;
    private Long assigneeId;
    private String assigneeName;
    private String phone;
    private Integer priority;
    private Integer status;
    private Long wareId;
    private BigDecimal amount;
    private Date createTime;
    private Date updateTime;

}

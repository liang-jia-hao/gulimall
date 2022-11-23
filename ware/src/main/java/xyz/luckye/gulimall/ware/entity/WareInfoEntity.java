package xyz.luckye.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Data;

@Data
@TableName("wms_ware_info")
public class WareInfoEntity {

    @TableId
    // id
    private Long id;
    private String name;
    private String address;
    private String areacode;

}

package xyz.luckye.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Data;

@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity {

    // id
    @TableId
    private Long id;
    // member_id
    private Long memberId;
    // create_time
    private Date createTime;
    // 变化的值
    private Integer changeCount;
    // 备注
    private String note;
    // 来源[0->购物；1->管理员修改;2->活动]
    private Integer sourceTyoe;

}

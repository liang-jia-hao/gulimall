package xyz.luckye.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Data;

@Data
@TableName("ums_member_login_log")
public class MemberLoginLogEntity {

    // id
    @TableId
    private Long id;
    // member_id
    private Long memberId;
    // 创建时间
    private Date createTime;
    // ip
    private String ip;
    // city
    private String city;
    // 登录类型[1-web，2-app]
    private Integer loginType;

}

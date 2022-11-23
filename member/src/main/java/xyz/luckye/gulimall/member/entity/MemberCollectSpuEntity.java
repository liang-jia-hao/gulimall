package xyz.luckye.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Data;

@Data
@TableName("ums_member_collect_spu")
public class MemberCollectSpuEntity {

    // id
    @TableId
    private Long id;
    // 会员id
    private Long memberId;
    // spu_id
    private Long spuId;
    // spu_name
    private String spuName;
    // spu_img
    private String spuImg;
    // create_time
    private Date createTime;

}

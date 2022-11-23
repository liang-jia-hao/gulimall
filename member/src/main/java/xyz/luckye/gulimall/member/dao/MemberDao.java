package xyz.luckye.gulimall.member.dao;

import xyz.luckye.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}

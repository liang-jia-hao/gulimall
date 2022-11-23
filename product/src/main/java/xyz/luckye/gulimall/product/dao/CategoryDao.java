package xyz.luckye.gulimall.product.dao;

import xyz.luckye.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author liangye
 * @email liangye1201@gmail.com
 * @date 2022-11-23 17:06:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}

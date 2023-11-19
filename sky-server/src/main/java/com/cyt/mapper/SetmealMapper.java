package com.cyt.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName: SetemalMapper
 * Package: com.cyt.mapper
 * Description:
 *
 * @Author CYT
 * @Create 2023/11/19 13:53
 * @Version 1.0
 */
@Mapper
public interface SetmealMapper {
    /**
     * 根据分类id查询套餐的数量
     * @param id
     * @return
     */
    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);
}

package com.cyt.mapper;

import com.cyt.annotation.AutoFill;
import com.cyt.entity.Dish;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.cyt.enumeration.OperationType;
/**
 * ClassName: DishMapper
 * Package: com.cyt.mapper
 * Description:
 *
 * @Author CYT
 * @Create 2023/11/19 13:50
 * @Version 1.0
 */
@Mapper
public interface DishMapper {
    /**
     * 根据分类id查询菜品数量
     * @param categoryId
     * @return
     */
    @Select("select count(id) from dish where category_id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);

    /**
     * 插入菜品数据
     *
     * @param dish
     */
    @Insert("insert into dish" +
            "(name, category_id, price, image, description, create_time, update_time, create_user,update_user, status)" +
            "values " +
            "(#{name}, #{categoryId}, #{price}, #{image}, #{description}, #{createTime}, " +
            "#{updateTime}, #{createUser}, #{updateUser}, #{status})")
    @AutoFill(value = OperationType.INSERT)
    void insert(Dish dish);
}

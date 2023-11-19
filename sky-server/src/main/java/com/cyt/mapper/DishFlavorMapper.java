package com.cyt.mapper;

import com.cyt.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: DishFlavorMapper
 * Package: com.cyt.mapper
 * Description:
 *
 * @Author CYT
 * @Create 2023/11/19 17:12
 * @Version 1.0
 */
@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}

package com.cyt.server;

import com.cyt.dto.CategoryDTO;
import com.cyt.dto.CategoryPageQueryDTO;
import com.cyt.entity.Category;
import com.cyt.result.PageResult;

import java.util.List;

/**
 * ClassName: CategoryService
 * Package: com.cyt.server
 * Description:
 *
 * @Author CYT
 * @Create 2023/11/19 14:14
 * @Version 1.0
 */
public interface CategoryService {
    /**
     * 新增分类
     * @param categoryDTO
     */
    void save(CategoryDTO categoryDTO);

    /**
     * 分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 根据id删除分类
     * @param id
     */
    void deleteById(Long id);

    /**
     * 修改分类
     * @param categoryDTO
     */
    void update(CategoryDTO categoryDTO);

    /**
     * 启用、禁用分类
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据类型查询分类
     * @param type
     * @return
     */
    List<Category> list(Integer type);
}

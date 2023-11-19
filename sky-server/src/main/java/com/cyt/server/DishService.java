package com.cyt.server;

import com.cyt.dto.DishDTO;

/**
 * ClassName: DishService
 * Package: com.cyt.server
 * Description:
 *
 * @Author CYT
 * @Create 2023/11/19 17:02
 * @Version 1.0
 */
public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);
}

package com.cyt.controller.admin;

import com.cyt.dto.DishDTO;
import com.cyt.mapper.DishMapper;
import com.cyt.result.Result;
import com.cyt.server.DishService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ClassName: DishController
 * Package: com.cyt.controller.admin
 * Description:
 *              菜品管理
 * @Author CYT
 * @Create 2023/11/19 17:00
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/dish")
@Api(tags = "菜鸟相关接口")
@Slf4j
public class DishController {
    @Autowired
    private DishService dishservice;

    /**
     * 新增菜品
     * @param dishDTO
     * @return
     */
    @PostMapping
    @ApiOperation("新增菜品")
    public Result save(DishDTO dishDTO){
        log.info("新增菜品:{}",dishDTO);
        dishservice.saveWithFlavor(dishDTO);
        return Result.success();
    }
}

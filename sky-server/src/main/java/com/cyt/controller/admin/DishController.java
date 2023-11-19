package com.cyt.controller.admin;

import com.cyt.mapper.DishMapper;
import com.cyt.server.DishService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DishMapper dishMapper;
}

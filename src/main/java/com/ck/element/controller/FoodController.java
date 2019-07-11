package com.ck.element.controller;

import com.ck.element.domain.JsonData;
import com.ck.element.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FoodController
 * @Description TODO
 * @Author ck
 * @Date 2019/7/2 22:38
 * @Version 1.0
 **/
@RestController
@RequestMapping("pub")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @RequestMapping("findAllFood")
    public JsonData findAllFood()
    {
        return  JsonData.buildSuccess(foodService.findAllFood());
    }
}

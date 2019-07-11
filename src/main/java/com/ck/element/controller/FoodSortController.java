package com.ck.element.controller;

import com.ck.element.domain.JsonData;
import com.ck.element.service.FoodSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FoodSortController
 * @Description TODO
 * @Author ck
 * @Date 2019/7/3 15:21
 * @Version 1.0
 **/
@RestController
@RequestMapping("pub")
public class FoodSortController {
    @Autowired
    private FoodSortService foodSortService;
    @RequestMapping("index_category")
    public JsonData findAllFoodSort()
    {
        return  JsonData.buildSuccess(foodSortService.findAllFoodSort());


    }
}

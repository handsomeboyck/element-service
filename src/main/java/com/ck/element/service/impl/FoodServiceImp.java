package com.ck.element.service.impl;

import com.ck.element.dao.FoodMapper;
import com.ck.element.domain.Food;
import com.ck.element.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName FoodServiceImp
 * @Description TODO
 * @Author ck
 * @Date 2019/7/2 22:36
 * @Version 1.0
 **/
@Service
public class FoodServiceImp implements FoodService {
    @Autowired
    private FoodMapper foodMapper;
    @Override
    public List<Food> findAllFood() {
        return  foodMapper.findAllFood();
    }


    @Override
    public List<Food> findFoodById(int id) {
        return foodMapper.findFoodById(id);
    }
}

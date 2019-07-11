package com.ck.element.service.impl;

import com.ck.element.dao.FoodSortMapper;
import com.ck.element.domain.FoodSort;
import com.ck.element.service.FoodSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName FoodSortServiceImp
 * @Description TODO
 * @Author ck
 * @Date 2019/7/3 15:19
 * @Version 1.0
 **/
@Service
public class FoodSortServiceImp implements FoodSortService {
    @Autowired
    private FoodSortMapper foodSortMapper;
    @Override
    public List<FoodSort> findAllFoodSort() {
        return foodSortMapper.findAllFoodSort();
    }
}

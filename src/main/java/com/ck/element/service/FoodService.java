package com.ck.element.service;

import com.ck.element.domain.Food;

import java.util.List;

public interface FoodService {
    List<Food> findAllFood();
    List<Food>  findFoodById(int id);
}


package com.ck.element.dao;

import com.ck.element.domain.Food;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FoodMapper {
    @Select("select * from Food")
    List<Food> findAllFood();

    @Select("select * from Food where store_id = #{store_id}")
    List<Food>   findFoodById(int id);

}

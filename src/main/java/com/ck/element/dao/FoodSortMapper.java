package com.ck.element.dao;

import com.ck.element.domain.FoodSort;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName FoodSortMapper
 * @Description TODO
 * @Author ck
 * @Date 2019/7/3 15:16
 * @Version 1.0
 **/
public interface FoodSortMapper {
    /**
     * 查找所有商品分类
     * @return
     */
    @Select("select * from FoodSort")
    List<FoodSort> findAllFoodSort();
}

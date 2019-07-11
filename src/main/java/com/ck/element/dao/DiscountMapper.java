package com.ck.element.dao;

import com.ck.element.domain.Discount;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DiscountMapper {

    @Select("select * from Discount")
    List<Discount> findAllDiscount();
}

package com.ck.element.service.impl;

import com.ck.element.service.DiscountService;
import com.ck.element.dao.DiscountMapper;
import com.ck.element.domain.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DiscountServiceIml
 * @Description TODO
 * @Author ck
 * @Date 2019/7/2 22:47
 * @Version 1.0
 **/
@Service
public class DiscountServiceIml implements DiscountService {
    @Autowired
    private DiscountMapper discountMapper;
    @Override
    public List<Discount> findAllDiscount() {
         return  discountMapper.findAllDiscount();
    }
}

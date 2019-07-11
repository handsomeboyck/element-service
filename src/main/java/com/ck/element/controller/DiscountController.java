package com.ck.element.controller;

import com.ck.element.domain.JsonData;
import com.ck.element.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DiscountController
 * @Description TODO
 * @Author ck
 * @Date 2019/7/2 22:49
 * @Version 1.0
 **/
@RestController
@RequestMapping("pub")
public class DiscountController {
    @Autowired
    private DiscountService discountService;
    @RequestMapping("findAllDiscount")
    public JsonData findAllDiscount()
    {
        return  JsonData.buildSuccess(discountService.findAllDiscount());

    }
}

package com.ck.element.controller;


import com.ck.element.domain.Good;
import com.ck.element.domain.JsonData;
import com.ck.element.service.GoodService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    GoodService goodService;
    /**
     * 视频订单页面
     * @return
     */
    @RequestMapping("/video/order")
    public JsonData findMyPlayRecord(){

        Map<String ,String> recordMap = new HashMap<>();

        recordMap.put("SpringBoot入门到高级实战","300元");
        recordMap.put("Cloud微服务入门到高级实战","877元");
        recordMap.put("分布式缓存Redis","990元");

        return JsonData.buildSuccess(recordMap);

    }

    /**
     * 插入新商品，插入时间为系统时间
     * @param name
     * @param price
     * @return
     */
    @RequestMapping("/video/insert")
    public JsonData InsertGood(@Param("name") String name,@Param("price") Double price)
    {
        Good good = new Good();
        good.setName(name);
        good.setDate(new Date());
        good.setPrice(price);
        int id = goodService.InsertGood(good);



        return JsonData.buildSuccess(id,-3);
    }

}

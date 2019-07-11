package com.ck.element.controller;

import com.ck.element.domain.Good;
import com.ck.element.domain.JsonData;
import com.ck.element.service.GoodService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GoodController
 * @Description TODO
 * @Author ck
 * @Date 2019/6/27 20:11
 * @Version 1.0
 **/
@RestController
@RequestMapping("admin")
public class GoodController {
    @Autowired
    GoodService goodService;
    @RequestMapping("/delete")
    public JsonData deleteGood(@Param("id")int id){

        goodService.DeleteGood(id);
        return JsonData.buildSuccess("商品id为"+id+"的商品下架成功");

    }
    @PostMapping("/updateGood")
    public JsonData updateGood(@RequestBody Good good)
    {
        goodService.UpdateGood(good);
        return JsonData.buildSuccess("商品id为"+good.getId()+"的商品更新成功");
    }
}

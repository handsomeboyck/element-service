package com.ck.element.controller;

import com.ck.element.domain.JsonData;
import com.ck.element.domain.Store;

import com.ck.element.service.FoodService;
import com.ck.element.service.StoreService;
import com.ck.element.service.SupportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


/**
 * @ClassName StoreController
 * @Description TODO
 * @Author ck
 * @Date 2019/7/2 22:23
 * @Version 1.0
 **/
@RestController
@RequestMapping("pub")
public class StoreController {
    @Autowired
    private StoreService storeService;
    @Autowired
    private SupportService supportService;
    @Autowired
    private FoodService foodService;


    @RequestMapping("findAllStore")
    public JsonData findAllStore()
    {


       List<Store> lists = storeService.findAllStore();

       for (Store list : lists)
       {
//           System.out.println(list.getStoreId()+"++++++++++++++++++++++++++++");
           list.setFoodList(foodService.findFoodById(list.getStoreId()));
           list.setSupports(supportService.findSupportById(list.getStoreId()));

       }



        return JsonData.buildSuccess(lists);


    }

    @RequestMapping("findStoreById")
    public  JsonData findStoreById(int id)
    {
        return JsonData.buildSuccess(storeService.findStoreById(id));
    }


    @RequestMapping("findAllSupport")
    public  JsonData Test_s()
    {
        return  JsonData.buildSuccess(supportService.findAllSupport());
    }


}

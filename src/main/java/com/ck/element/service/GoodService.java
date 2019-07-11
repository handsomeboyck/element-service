package com.ck.element.service;

import com.ck.element.domain.Good;

import java.util.List;

/**
 * 商品服务类
 */
public interface GoodService {
    /**
     * 查询所有商品接口
     * @return
     */
   List<Good> findAllGoods();

    /**
     *名字查询商品接口
     * @param name
     * @return
     */
   List<Good> findByName(String name);



    /**
     * 价格上限查询接口
     * @param price
     * @return
     */
    List<Good> findByPrice(float price);

    /**
     * 价格上下限查询价格接口
     * @param max_price
     * @param min_price
     * @return
     */
    List<Good> findByDividePrice(float max_price,float min_price);

    /**
     * 插入商品接口
     * @param good
     * @return
     */
     int InsertGood(Good good);

    /**
     * 通过id删除商品
     * @param id
     */
    void DeleteGood(int id);

    /**
     * 通过id更新商品
     */
    void UpdateGood(Good good);



}

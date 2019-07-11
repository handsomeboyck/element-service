package com.ck.element.service.impl;

import com.ck.element.dao.GoodsMapper;
import com.ck.element.domain.Good;
import com.ck.element.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 *  商品接口
 */
@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Good> findAllGoods()
    {
     return goodsMapper.findAllGood();


    }

    public List<Good> findByName(String name)
    {
        return goodsMapper.findByUsername(name);
    }
    //根据价格查询商品
    public List<Good> findByPrice(float price)
    {
        return goodsMapper.findByPrice(price);

    }

    public List<Good> findByDividePrice(float max_price,float min_price)
    {
        return goodsMapper.findByDividePrice(max_price,min_price);
    }

    public int InsertGood(Good good)
    {
        goodsMapper.insert(good);
        int id = good.getId();
        return id;

    }

    /**
     * 通过id删除商品
     * @param id
     */
    public void DeleteGood(int id)
    {
        goodsMapper.Delete(id);
    }


    @Override
    public void UpdateGood(Good good) {
        good.setDate(new Date());
        goodsMapper.UpdateGood(good);
    }
}



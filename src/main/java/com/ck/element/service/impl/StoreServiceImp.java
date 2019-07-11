package com.ck.element.service.impl;

import com.ck.element.dao.StoreMapper;
import com.ck.element.domain.Support;
import com.ck.element.domain.Store;
import com.ck.element.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName StoreServiceImp
 * @Description TODO
 * @Author ck
 * @Date 2019/7/2 22:20
 * @Version 1.0
 **/
@Service
public class StoreServiceImp  implements StoreService {
    @Autowired
    private StoreMapper storeMapper;
    @Override
    public List<Store> findAllStore() {
        return  storeMapper.findAllStore();
    }

    @Override
    public List<Store> findStoreById(int id) {
        return storeMapper.findStoreByID(id);
    }


}

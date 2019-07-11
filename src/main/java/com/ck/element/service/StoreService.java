package com.ck.element.service;

import com.ck.element.domain.Store;
import com.ck.element.domain.Support;

import java.util.List;

public interface StoreService {
    List<Store> findAllStore();
    List<Store>  findStoreById(int id);

}

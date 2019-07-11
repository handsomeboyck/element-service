package com.ck.element.dao;

import com.ck.element.domain.Support;
import com.ck.element.domain.Store;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StoreMapper {

    @Select("select * from Store")
    List<Store> findAllStore();

    @Select(
            "select * from Store where id = #{id}"
    )
    List<Store>  findStoreByID(int id);



}

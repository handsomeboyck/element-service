package com.ck.element.service;

import com.ck.element.domain.Good;
import com.ck.element.domain.User;

import java.util.List;

public interface UserService {


    /**
     * 获取全部用户信息，包括角色，权限
     * @param username
     * @return
     */
    User findAllUserInfoByUsername(String username);

    /**
     * 查询全部商品的信息
     * @return
     */
    List<Good> findAllGood();

    /**
     * 通过商品名称查询商品
     * @param name
     * @return
     */
    List<Good> findByName(String name);

    //根据价格查询商品
    List<Good> findByPrice(float price);
    /**
     * 获取用户基本信息
     * @param userId
     * @return
     */
    User findSimpleUserInfoById(int userId);


    /**
     * 根据用户名查找用户信息
     * @param username
     * @return
     */
    User findSimpleUserInfoByUsername(String username);






}

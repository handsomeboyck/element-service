package com.ck.element.service.impl;

import com.ck.element.dao.RoleMapper;
import com.ck.element.dao.GoodsMapper;
import com.ck.element.dao.UserMapper;
import com.ck.element.domain.Good;
import com.ck.element.domain.Role;
import com.ck.element.domain.User;
import com.ck.element.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户接口
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public User findAllUserInfoByUsername(String username) {
        User user = userMapper.findByUsername(username);

        //用户的角色集合
        List<Role> roleList =  roleMapper.findRoleListByUserId(user.getId());


        user.setRoleList(roleList);

        return user;
    }


    @Override
    public User findSimpleUserInfoById(int userId) {
        return userMapper.findById(userId);
    }


    @Override
    public User findSimpleUserInfoByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    public List<Good> findAllGood()
    {
        return goodsMapper.findAllGood();
    }

    public List<Good> findByName(String name)
    {
        return goodsMapper.findByUsername(name);
    }

    public List<Good> findByPrice(float price)
    {
        return goodsMapper.findByPrice(price);
    }



}

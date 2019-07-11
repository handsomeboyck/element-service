package com.ck.element.service.impl;

import com.ck.element.dao.SupportMapper;
import com.ck.element.domain.Support;
import com.ck.element.service.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SupportServiceImp
 * @Description TODO
 * @Author ck
 * @Date 2019/7/5 21:14
 * @Version 1.0
 **/
@Service
public class SupportServiceImp implements SupportService {
    @Autowired
    private SupportMapper supportMapper;

    public List<Support> findAllSupport() {
        return supportMapper.findAllSupport();
    }

    @Override
    public List<Support> findSupportById(int id) {
        return  supportMapper.findSupportById(id);
    }
}

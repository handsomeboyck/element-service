package com.ck.element.service;

import com.ck.element.domain.Support;

import java.util.List;

public interface SupportService {
    List<Support> findAllSupport();
    List<Support>  findSupportById(int id);
}

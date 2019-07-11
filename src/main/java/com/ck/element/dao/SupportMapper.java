package com.ck.element.dao;

import com.ck.element.domain.Support;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SupportMapper {
    @Select("select * from Support")
    List<Support> findAllSupport();

    @Select("select * from Support where store_id = #{store_id}")
    List<Support>   findSupportById(int id);
}

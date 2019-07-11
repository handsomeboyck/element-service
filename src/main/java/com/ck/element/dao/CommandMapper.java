package com.ck.element.dao;

import com.ck.element.domain.Command;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommandMapper {
    @Insert("INSERT INTO Command(user_name,text,date) VALUES(#{user_name}, #{text}, #{date})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(Command command);


    @Select("select * from Command limit #{limit}")
    List<Command> findCommand(@Param("limit") int limit);
}

package com.ck.element.dao;


import com.ck.element.domain.Exam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface ExamMapper {
    @Insert("INSERT INTO Exam(question,answer1,answer2,answer3,answer4) VALUES(#{question}, #{answer1}, #{answer2},#{answer3},#{answer4})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(Exam exam);

}

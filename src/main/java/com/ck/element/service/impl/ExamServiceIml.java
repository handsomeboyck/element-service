package com.ck.element.service.impl;

import com.ck.element.dao.ExamMapper;
import com.ck.element.domain.Exam;
import com.ck.element.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ExamServiceIml
 * @Description 试卷查询接口
 * @Author ck
 * @Date 2019/6/27 22:13
 * @Version 1.0
 **/
@Service
public class ExamServiceIml implements ExamService {
   @Autowired
   ExamMapper examMapper;
   public int InsertQuestion(Exam exam)
   {
      examMapper.insert(exam);
      return  exam.getId();


   }
}

package com.ck.element.controller;

import com.ck.element.domain.Exam;
import com.ck.element.domain.JsonData;
import com.ck.element.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @ClassName ExamController
 * @Description TODO
 * @Author ck
 * @Date 2019/6/27 22:17
 * @Version 1.0
 **/
@RestController
@RequestMapping("admin")
public class ExamController {
    @Autowired
    private ExamService examService;

    @PostMapping("insertQuestion")
    public JsonData InsertQuestion(@RequestBody Exam exam)
    {

        int id =  examService.InsertQuestion(exam);
        return JsonData.buildSuccess(id);

    }

}

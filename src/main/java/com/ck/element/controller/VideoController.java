package com.ck.element.controller;


import com.ck.element.domain.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 更新视频列表
 */
@RestController
@RequestMapping("video")
public class VideoController {

    @RequestMapping("/update")
    public JsonData updateVideo(){

        return JsonData.buildSuccess("video更新成功");

    }

}

package com.ck.element.domain;

import java.util.Date;

/**
 * @ClassName Command
 * @Description 评论实体类
 * @Author ck
 * @Date 2019/6/27 20:37
 * @Version 1.0
 **/
public class Command {
    private Integer id;
    private String  user_name;
    private String text;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

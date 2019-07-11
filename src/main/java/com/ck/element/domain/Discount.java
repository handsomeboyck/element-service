package com.ck.element.domain;

/**
 * @ClassName Discount
 * @Description TODO
 * @Author ck
 * @Date 2019/7/2 22:42
 * @Version 1.0
 **/
public class Discount {
    private  int id;
    private  String name;
    private  int type;
    private  String content;
    private int discount_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }
}

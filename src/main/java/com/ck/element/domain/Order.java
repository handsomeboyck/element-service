package com.ck.element.domain;

/**
 * @ClassName Order
 * @Description 订单
 * @Author ck
 * @Date 2019/7/1 22:40
 * @Version 1.0
 **/
public class Order {
    private Integer id;
    private String name;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

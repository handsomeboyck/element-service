package com.ck.element.domain;

/**
 * @ClassName Food
 * @Description TODO
 * @Author ck
 * @Date 2019/7/2 22:30
 * @Version 1.0
 **/
public class Food {
    private  int id;
    private  String name;
    private int storeId;
    private String price;
    private  String description;
    private String rate;

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


    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}


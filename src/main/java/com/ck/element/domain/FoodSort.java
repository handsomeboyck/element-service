package com.ck.element.domain;

/**
 * @ClassName FoodSort
 * @Description TODO
 * @Author ck
 * @Date 2019/7/3 15:13
 * @Version 1.0
 **/
public class FoodSort {
    private int id;
    private String is_in_serving;
    private String description;
    private String title;
    private String link;
    private String image_url;
    private String icon_url;
    private  String title_color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIs_in_serving() {
        return is_in_serving;
    }

    public void setIs_in_serving(String is_in_serving) {
        this.is_in_serving = is_in_serving;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getTitle_color() {
        return title_color;
    }

    public void setTitle_color(String title_color) {
        this.title_color = title_color;
    }
}

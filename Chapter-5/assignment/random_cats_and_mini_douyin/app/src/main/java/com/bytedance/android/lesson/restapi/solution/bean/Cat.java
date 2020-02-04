package com.bytedance.android.lesson.restapi.solution.bean;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json

    /**
     * breeds : []
     * id : m3
     * url : https://cdn2.thecatapi.com/images/m3.jpg
     * width : 500
     * height : 333
     */

    private String id;
    private String url;
    private int width;
    private int height;
    private List<?> breeds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<?> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<?> breeds) {
        this.breeds = breeds;
    }
}

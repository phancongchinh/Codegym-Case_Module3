package com.codegym.model;

public class Image {
    private int id;
    private String src;
    private String name;
    private int productId;

    public Image() {
    }

    public Image(int id, String src, String name, int productId) {
        this.id = id;
        this.src = src;
        this.name = name;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}

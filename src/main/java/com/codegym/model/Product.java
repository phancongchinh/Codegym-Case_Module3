package com.codegym.model;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private String brand;
    private String SKU;
    private int categoryId;
    private int vendorId;
    private int discountId;
    private LocalDate createdAt;
    private LocalDate lastModifiedAt;
    private LocalDate deleteAt;

    public Product() {
    }

    public Product(int id, String name, String description, double price, String brand, String SKU, int categoryId, int vendorId, int discountId, LocalDate createdAt, LocalDate lastModifiedAt, LocalDate deleteAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.SKU = SKU;
        this.categoryId = categoryId;
        this.vendorId = vendorId;
        this.discountId = discountId;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.deleteAt = deleteAt;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(LocalDate lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public LocalDate getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(LocalDate deleteAt) {
        this.deleteAt = deleteAt;
    }
}
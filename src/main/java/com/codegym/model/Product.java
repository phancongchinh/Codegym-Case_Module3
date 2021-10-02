package com.codegym.model;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String description;
    private int categoryId;
    private String brand;
    private int vendorId;
    private String SKU;
    private double price;
    private int discountId;
    private LocalDate manufacturingDate;
    private long expirationTime;
    private LocalDate createdAt;
    private LocalDate lastModifiedAt;
    private LocalDate deleteAt;

    public Product() {
    }

    public Product(int id, String name, String description, int categoryId, String brand, int vendorId, String SKU, double price, int discountId, LocalDate manufacturingDate, long expirationTime, LocalDate createdAt, LocalDate lastModifiedAt, LocalDate deleteAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
        this.brand = brand;
        this.vendorId = vendorId;
        this.SKU = SKU;
        this.price = price;
        this.discountId = discountId;
        this.manufacturingDate = manufacturingDate;
        this.expirationTime = expirationTime;
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

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
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
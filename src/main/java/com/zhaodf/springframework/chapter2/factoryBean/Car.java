package com.zhaodf.springframework.chapter2.factoryBean;

public class Car {
    private String maxSpeed;
    private String brand;
    private double price;

    public java.lang.String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(java.lang.String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package com.company;

import java.awt.*;
import java.time.LocalDate;

public class InfoCar {
    //год выпуска, модель, цена, цвет
    private LocalDate yearsOfIssue;
    private String model;
    private int price;
    private String color;

    public InfoCar() {
    }

    public InfoCar(LocalDate yearsOfIssue, String model, int price, String color) {
        this.yearsOfIssue = yearsOfIssue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public LocalDate getYearsOfIssue() {
        return yearsOfIssue;
    }

    public void setYearsOfIssue(LocalDate yearsOfIssue) {
        this.yearsOfIssue = yearsOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "InfoCar{" +
                "yearsOfIssue=" + yearsOfIssue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

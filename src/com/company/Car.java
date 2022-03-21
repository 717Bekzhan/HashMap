package com.company;

public class Car {
    private double ID;
    private double carNumber;

    public Car() {
    }

    public Car(double ID, double carNumber) {
        this.ID = ID;
        this.carNumber = carNumber;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public double getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(double carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", carNumber=" + carNumber +
                '}';
    }
}

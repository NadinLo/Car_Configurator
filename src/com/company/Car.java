package com.company;

import java.util.ArrayList;

public class Car implements Cloneable {
    Brand brand;
    String colour;
    int hp;
    TypeOfDrive typeOfDrive;
    Fuel fuel;
    String serialNumber;
    int number = 7786;

    public Car() {
        this.brand = Brand.AUDI;
        this.colour = "black";
        this.hp = 100;
        this.typeOfDrive = TypeOfDrive.ALL_WHEEL;
        this.fuel = Fuel.GASOLINE;
        this.serialNumber = getSerialNumber();
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        serialNumber = "A3" + this.number++;
        return serialNumber;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

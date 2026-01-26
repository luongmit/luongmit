/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
import java.util.ArrayList;

abstract class Vehicle {
    protected String brand;
    public Vehicle(String brand) { this.brand = brand; }
    public abstract int getMaxSpeed();
    public void showInfo() {
        System.out.println("Hang: " + brand + " | Toc do max: " + getMaxSpeed() + " km/h");
    }
}

class Car extends Vehicle {
    public Car(String brand) { super(brand); }
    @Override
    public int getMaxSpeed() { return 180; }
}

class Motorbike extends Vehicle {
    public Motorbike(String brand) { super(brand); }
    @Override
    public int getMaxSpeed() { return 120; }
}

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("=== BAI 3: PHUONG TIEN ===");
        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(new Car("Toyota"));
        list.add(new Motorbike("Honda"));
        for (Vehicle v : list) v.showInfo();
    }
}

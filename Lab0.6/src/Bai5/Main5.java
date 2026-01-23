/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author 1000l
 */
class Vehicle {
    String brand;
    public Vehicle(String brand) { this.brand = brand; }
    
    public void start() {
        System.out.println("Xe " + brand + " dang khoi dong...");
    }
}

class Car extends Vehicle {
    int seatCount;
    public Car(String brand, int seatCount) {
        super(brand);
        this.seatCount = seatCount;
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String brand, int seatCount, int batteryCapacity) {
        super(brand, seatCount);
        this.batteryCapacity = batteryCapacity;
    }
    
    public void showInfo() {
        System.out.println("Hang: " + brand + ", So ghe: " + seatCount + ", Pin: " + batteryCapacity + "kWh");
    }
}

public class Main5 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 5, 75);
        tesla.start();
        tesla.showInfo();
    }
}

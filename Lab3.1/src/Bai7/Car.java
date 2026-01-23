/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author 1000l
 */
public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate(int value) {
        this.speed += value;
        System.out.println("Dang tang toc...");
    }

    public void brake(int value) {
        if (this.speed - value < 0) {
            this.speed = 0;
        } else {
            this.speed -= value;
        }
        System.out.println("Dang phanh...");
    }

    public boolean isOverSpeed() {
        return speed > 100;
    }

    public void displayStatus() {
        System.out.println("Model: " + model + " (" + brand + ") - Speed: " + speed + "km/h");
    }

    public static void main(String[] args) {
        Car xe = new Car("Toyota", "Vios", 80);
        xe.displayStatus();
        
        xe.accelerate(30); 
        xe.displayStatus();
        
        if (xe.isOverSpeed()) System.out.println("CANH BAO: Qua toc do!");
        
        xe.brake(120);
        xe.displayStatus(); 
    }
}

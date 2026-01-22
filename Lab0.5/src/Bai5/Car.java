/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author 1000l
 */
public class Car {
    private String brand;
    private String color;
    private Engine engine;

    public Car(String brand, String color, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
    }

    public void display() {
        System.out.println("Xe: " + brand + " - Mau: " + color);
        engine.display();
    }
}

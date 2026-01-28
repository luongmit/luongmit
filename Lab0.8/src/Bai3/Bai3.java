/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
interface Vehicle {
    void start();

    default void honk() {
        System.out.println("Beep beep!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.honk(); 
    }
}

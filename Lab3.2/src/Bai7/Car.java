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
    String brand, model;
    int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate(int value) { speed += value; }
    
    public void brake(int value) {
        speed -= value;
        if(speed < 0) speed = 0;
    }
    
    public void displayStatus() {
        System.out.println("Model: " + model + " - Speed: " + speed);
    }
    
    public boolean isOverSpeed() { return speed > 100; }

    public static void main(String[] args) {

        Car myCar = new Car("Honda", "Civic", 50);

        System.out.println("Dap ga...");
        myCar.accelerate(60);

        myCar.displayStatus();

        if(myCar.isOverSpeed()) {
            System.out.println("Xe dang vuot qua toc do cho phep");
        }

        System.out.println("Dap phanh...");
        myCar.brake(50);
        myCar.displayStatus();
    }
}

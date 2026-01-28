/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

/**
 *
 * @author 1000l
 */
interface Movable {
    void move();
    
    default void stop() {
        System.out.println("Stopping");
    }
}

interface FuelConsumable {
    double getFuelConsumption();
}

interface ElectricChargeable {
    void charge();
}

class CarImpl implements Movable, FuelConsumable {
    @Override
    public void move() {
        System.out.println("Car is moving on road");
    }
    @Override
    public double getFuelConsumption() {
        return 7.5;
    }
}

class Bicycle implements Movable {
    @Override
    public void move() {
        System.out.println("Bicycle is pedaling");
    }

    @Override
    public void stop() {
        System.out.println("Using brakes to stop bicycle");
    }
}

class ElectricCar implements Movable, FuelConsumable, ElectricChargeable {
    @Override
    public void move() {
        System.out.println("Electric car runs silently");
    }
    
    @Override
    public double getFuelConsumption() {
        return 0; 
    }
    
    @Override
    public void charge() {
        System.out.println("Charging battery...");
    }
}

public class Bai10 {
    public static void main(String[] args) {
        Movable[] vehicles = new Movable[3];
        vehicles[0] = new CarImpl();
        vehicles[1] = new Bicycle();
        vehicles[2] = new ElectricCar();
        System.out.println("--- Traffic Simulation ---");
        for (Movable v : vehicles) {
            v.move();
            v.stop();
            if (v instanceof ElectricChargeable) {
                ((ElectricChargeable) v).charge();
            }
            System.out.println("----------------");
        }
    }
}

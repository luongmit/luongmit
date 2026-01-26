/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author 1000l
 */
import java.util.ArrayList;

abstract class Device {
    protected String name;
    public Device(String name) { this.name = name; }
    public abstract double powerConsumption();
    public void show() { System.out.println(name + ": " + powerConsumption() + "W"); }
}

class Laptop extends Device {
    public Laptop() { super("Laptop"); }
    @Override public double powerConsumption() { return 65; }
}

class AirConditioner extends Device {
    public AirConditioner() { super("Dieu Hoa"); }
    @Override public double powerConsumption() { return 1000; }
}

class Television extends Device {
    public Television() { super("Tivi"); }
    @Override public double powerConsumption() { return 150; }
}

public class Bai6 {
    public static void main(String[] args) {
        System.out.println("=== BAI 6: THIET BI ===");
        ArrayList<Device> list = new ArrayList<>();
        list.add(new Laptop());
        list.add(new AirConditioner());
        list.add(new Television());
        
        Device max = list.get(0);
        for(Device d : list) {
            d.show();
            if(d.powerConsumption() > max.powerConsumption()) max = d;
        }
        System.out.println("Ton dien nhat: " + max.name);
    }
}

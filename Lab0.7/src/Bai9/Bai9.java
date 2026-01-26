/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;

/**
 *
 * @author 1000l
 */
abstract class Transport {
    protected String name;
    public Transport(String n) { name = n; }
    public abstract double calcCost(double dist);
    public abstract int getCap();
    public void show(double d) {
        System.out.printf("%s | Cho: %d | Gia: %.0f\n", name, getCap(), calcCost(d));
    }
}

class Bus extends Transport {
    public Bus() { super("Bus"); }
    @Override public int getCap() { return 45; }
    @Override public double calcCost(double d) { return d * 5000; }
}

class Taxi extends Transport {
    public Taxi() { super("Taxi"); }
    @Override public int getCap() { return 4; }
    @Override public double calcCost(double d) { return d * 15000; }
}

class Train extends Transport {
    public Train() { super("Tau"); }
    @Override public int getCap() { return 200; }
    @Override public double calcCost(double d) { return d * 8000; }
}

public class Bai9 {
    public static void main(String[] args) {
        System.out.println("=== BAI 9: VAN TAI ===");
        Transport bus = new Bus();
        Transport taxi = new Taxi();
        bus.show(100);
        taxi.show(100);
        if(bus.calcCost(100) < taxi.calcCost(100)) 
            System.out.println("Re nhat: Bus");
    }
}

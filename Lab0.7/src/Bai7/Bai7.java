/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author 1000l
 */
import java.util.ArrayList;

abstract class Staff {
    protected String name;
    public Staff(String name) { this.name = name; }
    public abstract double getIncome();
    public void show() { System.out.printf("%s: %.0f VND\n", name, getIncome()); }
}

class OfficeStaff extends Staff {
    private double salary;
    public OfficeStaff(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    @Override public double getIncome() { return salary; }
}

class SalesStaff extends Staff {
    private double base, sales, rate;
    public SalesStaff(String name, double base, double sales, double rate) {
        super(name);
        this.base = base;
        this.sales = sales;
        this.rate = rate;
    }
    @Override public double getIncome() { return base + (sales * rate); }
}

public class Bai7 {
    public static void main(String[] args) {
        System.out.println("=== BAI 7: THU NHAP ===");
        ArrayList<Staff> list = new ArrayList<>();
        list.add(new OfficeStaff("HCNS", 5000000));
        list.add(new SalesStaff("Sale", 3000000, 50000000, 0.1));
        
        double total = 0;
        for(Staff s : list) {
            s.show();
            total += s.getIncome();
        }
        System.out.printf("Tong luong cty: %.0f VND\n", total);
    }
}

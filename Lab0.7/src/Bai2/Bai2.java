/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author 1000l
 */
abstract class Employee {
    protected String id, name;
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public abstract double calculateSalary();
    public void showInfo() {
        System.out.printf("ID: %s | Ten: %s | Luong: %.0f\n", id, name, calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;
    public FullTimeEmployee(String id, String name, double salary) {
        super(id, name);
        this.monthlySalary = salary;
    }
    @Override
    public double calculateSalary() { return monthlySalary; }
}

class PartTimeEmployee extends Employee {
    private int hours;
    private double rate;
    public PartTimeEmployee(String id, String name, int hours, double rate) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }
    @Override
    public double calculateSalary() { return hours * rate; }
}

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("=== BAI 2: NHAN VIEN ===");
        FullTimeEmployee ft = new FullTimeEmployee("NV1", "Tran Gia Luong", 10000000);
        PartTimeEmployee pt = new PartTimeEmployee("NV2", "Tran Thi Thu Nga", 50, 20000);
        ft.showInfo();
        pt.showInfo();
    }
}

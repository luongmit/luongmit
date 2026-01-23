/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

/**
 *
 * @author 1000l
 */
abstract class AbstractEmployee {
    String id;
    String name;

    public AbstractEmployee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();
}

class OfficeEmployee extends AbstractEmployee {
    double fixedSalary;

    public OfficeEmployee(String id, String name, double fixedSalary) {
        super(id, name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}

class SalesEmployee extends AbstractEmployee {
    double baseSalary;
    double commission;

    public SalesEmployee(String id, String name, double base, double comm) {
        super(id, name);
        this.baseSalary = base;
        this.commission = comm;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + commission;
    }
}

public class Main10 {
    public static void main(String[] args) {
        AbstractEmployee[] company = new AbstractEmployee[3];
        
        company[0] = new OfficeEmployee("6140371", "Luong", 1000);
        company[1] = new SalesEmployee("614", "Son", 500, 800);
        company[2] = new SalesEmployee("614", "Hai", 500, 1200);

        double totalSalary = 0;

        System.out.println("--- BANG LUONG ---");
        for (AbstractEmployee emp : company) {
            double luong = emp.calculateSalary();
            System.out.println("Nhan vien: " + emp.name + " - Luong: " + luong);
            totalSalary += luong;
        }

        System.out.println("------------------");
        System.out.println("TONG LUONG CONG TY: " + totalSalary);
    }
}

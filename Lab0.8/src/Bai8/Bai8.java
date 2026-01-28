/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

/**
 *
 * @author 1000l
 */
interface Payable {
    double calculateSalary();
}

class FullTimeEmployee implements Payable {
    @Override
    public double calculateSalary() {
        return 5000.0;
    }
}

class PartTimeEmployee implements Payable {
    private int hours;
    public PartTimeEmployee(int hours) { this.hours = hours; }
    
    @Override
    public double calculateSalary() {
        return hours * 20.0; 
    }
}

class Contractor implements Payable {
    @Override
    public double calculateSalary() {
        return 1000.0; 
    }
}

public class Bai8 {
    public static void paySalary(Payable p) {
        System.out.println("Paying salary: $" + p.calculateSalary());
    }
    public static void main(String[] args) {
        Payable fullTime = new FullTimeEmployee();
        Payable partTime = new PartTimeEmployee(50);
        Payable contractor = new Contractor();
        paySalary(fullTime);
        paySalary(partTime);
        paySalary(contractor);
    }
}

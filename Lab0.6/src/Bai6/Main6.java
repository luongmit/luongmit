/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author 1000l
 */
class Employee6 {
    String name;
    public Employee6(String name) { this.name = name; }
    
    public double getSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee6 {
    public FullTimeEmployee(String name) { super(name); }
    
    @Override
    public double getSalary() {
        return 5000; // Luong co dinh
    }
}

class PartTimeEmployee extends Employee6 {
    int hours;
    public PartTimeEmployee(String name, int hours) {
        super(name);
        this.hours = hours;
    }
    
    @Override
    public double getSalary() {
        return hours * 20; 
    }
}

public class Main6 {
    public static void main(String[] args) {
        Employee6[] staff = new Employee6[2];
        staff[0] = new FullTimeEmployee("Alice");
        staff[1] = new PartTimeEmployee("Bob", 50);

        for (Employee6 e : staff) {
            System.out.println("Luong cua " + e.name + ": " + e.getSalary());
        }
    }
}

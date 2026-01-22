/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai14;

/**
 *
 * @author 1000l
 */
public class Employee14 {
    String id, name;
    double salary;
    Department14 department;

    public Employee14(String id, String name, double salary, Department14 department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void display() {
        System.out.println("Nhan vien: " + name + " - Luong: " + salary);
        department.display();
    }
}

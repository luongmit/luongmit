/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author 1000l
 */
class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person2 {
    double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void displayTotalInfo() {
        System.out.println("NV: " + name + " - " + age + " tuoi - Luong: " + salary);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Tran Gia Luong", 20, 1500.0);
        emp.displayTotalInfo();
    }
}

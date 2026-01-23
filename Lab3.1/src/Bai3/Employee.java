/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public void input(Scanner sc) {
        System.out.print("Nhap ID NV: ");
        this.id = sc.nextLine();
        System.out.print("Nhap Ten NV: ");
        this.name = sc.nextLine();
        System.out.print("Nhap Luong: ");
        this.salary = sc.nextDouble();
    }

    public double calculateTax() {
        if (salary > 10000000) {
            return salary * 0.1;
        }
        return 0;
    }

    public void display() {
        System.out.printf("ID: %s - Name: %s - Luong: %.0f\n", id, name, salary);
        System.out.printf("Thue phai dong: %.0f\n", calculateTax());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        emp.input(sc);
        emp.display();
    }
}

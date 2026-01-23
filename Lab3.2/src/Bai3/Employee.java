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
    String id, name;
    double salary;

    public void input(Scanner sc) {
        System.out.print("Nhap ID: "); id = sc.nextLine();
        System.out.print("Nhap Ten: "); name = sc.nextLine();
        System.out.print("Nhap Luong: "); salary = sc.nextDouble();
    }

    public void display() {
        System.out.printf("ID: %s - Name: %s - Salary: %.0f\n", id, name, salary);
    }

    public double calculateTax() {
        return (salary > 10000000) ? salary * 0.1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        emp.input(sc);

        emp.display();

        double tax = emp.calculateTax();
        if (tax == 0) {
            System.out.println("Khong phai dong thue");
        } else {
            System.out.printf("So tien thue phai dong: %.0f\n", tax);
        }
    }
}

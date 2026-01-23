/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Circle {
    double radius;

    public void input(Scanner sc) {
        System.out.print("Nhap ban kinh: "); radius = sc.nextDouble();
    }

    public double getArea() { return Math.PI * radius * radius; }
    public double getPerimeter() { return 2 * Math.PI * radius; }
    public boolean isBigCircle() { return getArea() > 100; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        c.input(sc);

        System.out.printf("Dien tich: %.2f\n", c.getArea());
        System.out.printf("Chu vi: %.2f\n", c.getPerimeter());

        if (c.isBigCircle()) {
            System.out.println("Hinh tron lon");
        } else {
            System.out.println("Hinh tron nho");
        }
    }
}

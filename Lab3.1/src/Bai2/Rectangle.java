/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Rectangle {
    private double dai; // Chiều dài
    private double rong;  // Chiều rộng

    public void input(Scanner sc) {
        System.out.print("Nhap chieu dai: ");
        this.dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        this.rong = sc.nextDouble();
    }

    public double getArea() {
        return dai * rong;
    }

    public double getPerimeter() {
        return (dai + rong) * 2;
    }

    public void display() {
        System.out.println("Dai: " + dai + " - Rong: " + rong);
        System.out.println("Dien tich: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle hcn = new Rectangle();
        hcn.input(sc);
        hcn.display();
    }
}

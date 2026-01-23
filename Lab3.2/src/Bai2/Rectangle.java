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
    double length, width;

    public void input(Scanner sc) {
        System.out.print("Nhap chieu dai: "); length = sc.nextDouble();
        System.out.print("Nhap chieu rong: "); width = sc.nextDouble();
    }

    public double getArea() { return length * width; }
    public double getPerimeter() { return (length + width) * 2; }

    public void display() {
        System.out.println("Dai: " + length + " - Rong: " + width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        rect.input(sc);

        rect.display();

        System.out.println("Dien tich: " + rect.getArea());
        System.out.println("Chu vi: " + rect.getPerimeter());
    }
}

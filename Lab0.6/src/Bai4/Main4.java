/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author 1000l
 */
class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Dien tich hinh chu nhat: " + rect.getArea());
    }
}

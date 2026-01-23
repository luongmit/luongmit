/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author 1000l
 */
abstract class AbstractShape {
    public abstract double getArea();
}

class Circle extends AbstractShape {
    double radius;
    public Circle(double radius) { this.radius = radius; }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rect7 extends AbstractShape {
    double width, height;
    public Rect7(double w, double h) { this.width = w; this.height = h; }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Main7 {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(5.0);
        AbstractShape s2 = new Rect7(4.0, 5.0);
        
        System.out.println("Dien tich hinh tron: " + s1.getArea());
        System.out.println("Dien tich HCN: " + s2.getArea());
    }
}

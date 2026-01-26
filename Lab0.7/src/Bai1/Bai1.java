/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author 1000l
 */
import java.util.ArrayList;

// Lop truu tuong
abstract class Shape {
    protected String name;
    public Shape(String name) { this.name = name; }
    public abstract double area();
    
    public void display() {
        System.out.println("Hinh: " + name + " | Dien tich: " + area());
    }
}

class Rectangle extends Shape {
    private double width, height;
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() { return width * height; }
}

class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double area() { return Math.PI * radius * radius; }
}

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Rectangle("HCN A", 4, 5));
        list.add(new Rectangle("HCN B", 2, 8));
        list.add(new Circle("Tron C", 3));

        System.out.println("=== BAI 1: HINH HOC ===");
        for (Shape s : list) s.display();
    }
}

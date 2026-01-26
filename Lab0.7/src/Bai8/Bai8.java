/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

/**
 *
 * @author 1000l
 */
abstract class GeoObject {
    public abstract double getArea();
    public abstract double getPerimeter();
    public void show() { System.out.printf("DT: %.2f | CV: %.2f\n", getArea(), getPerimeter()); }
}

class Rect2 extends GeoObject {
    double w, h;
    public Rect2(double w, double h) { this.w = w; this.h = h; }
    @Override public double getArea() { return w*h; }
    @Override public double getPerimeter() { return (w+h)*2; }
}

class Square2 extends GeoObject {
    double s;
    public Square2(double s) { this.s = s; }
    @Override public double getArea() { return s*s; }
    @Override public double getPerimeter() { return s*4; }
}

class Circle2 extends GeoObject {
    double r;
    public Circle2(double r) { this.r = r; }
    @Override public double getArea() { return Math.PI*r*r; }
    @Override public double getPerimeter() { return 2*Math.PI*r; }
}

public class Bai8 {
    public static void main(String[] args) {
        System.out.println("=== BAI 8: HINH HOC NC ===");
        new Rect2(4,5).show();
        new Square2(4).show();
        new Circle2(5).show();
    }
}

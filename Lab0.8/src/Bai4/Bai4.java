/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author 1000l
 */
interface ShapeV2 {
    double PI = 3.14159;
    double calculateArea();
    double calculatePerimeter();

    static String getInfo() {
        return "This is a shape interface";
    }
}

public class Bai4 {
    public static void main(String[] args) {
        System.out.println(ShapeV2.getInfo());
    }
}

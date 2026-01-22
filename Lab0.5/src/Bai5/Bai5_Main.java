/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author 1000l
 */
public class Bai5_Main {
    public static void main(String[] args) {
        Engine dc = new Engine("V8 Turbo", 500);
        Car xe = new Car("Ferrari", "Do", dc);
        xe.display();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12;

/**
 *
 * @author 1000l
 */
public class Bai12_Main {
    public static void main(String[] args) {
        Product sp = new Product("Laptop Dell", 15000000);
        Order don = new Order("DH009", sp);
        don.display();
    }
}

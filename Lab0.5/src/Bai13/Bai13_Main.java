/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai13;

/**
 *
 * @author 1000l
 */
public class Bai13_Main {
    public static void main(String[] args) {
        Customer13 kh = new Customer13("KH35", "A Luong");
        Invoice hd = new Invoice("HD999", 250000, kh);
        hd.display();
    }
}

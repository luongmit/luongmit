/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;
import java.util.Scanner;
/**
 *
 * @author 1000l
 */
public class Address7 {
    String street, city;
    public void input(Scanner sc) {
        System.out.print("Nhap duong: "); street = sc.nextLine();
        System.out.print("Nhap thanh pho: "); city = sc.nextLine();
    }
    public void display() { System.out.println("Dia chi: " + street + ", " + city); }
}

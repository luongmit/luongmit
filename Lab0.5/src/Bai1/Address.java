/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.util.Scanner;
/**
 *
 * @author 1000l
 */
public class Address {private String street;
    private String city;

    public void input(Scanner sc) {
        System.out.print("Nhap ten duong: ");
        this.street = sc.nextLine();
        System.out.print("Nhap thanh pho: ");
        this.city = sc.nextLine();
    }

    public void display() {
        System.out.println("Dia chi: " + street + ", " + city);
    }
}

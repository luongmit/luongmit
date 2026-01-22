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
public class Customer {
    String id, name;
    Address7 address; 

    public Customer() { address = new Address7(); }

    public void input(Scanner sc) {
        System.out.print("Nhap ID khach: "); id = sc.nextLine();
        System.out.print("Nhap ten khach: "); name = sc.nextLine();
        address.input(sc);
    }

    public void display() {
        System.out.println("Khach: " + name + " (" + id + ")");
        address.display();
    }
}

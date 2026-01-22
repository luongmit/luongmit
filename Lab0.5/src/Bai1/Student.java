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
public class Student {
    private String id;
    private String name;
    private Address address; // Quan hệ HAS-A: Student có một Address

    public Student() {
        this.address = new Address(); // Khởi tạo đối tượng Address
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ma SV: ");
        this.id = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.name = sc.nextLine();
        
        // Gọi hàm nhập của Address
        System.out.println("--- Nhap thong tin dia chi ---");
        this.address.input(sc);
    }

    public void display() {
        System.out.println("\n=== THONG TIN SINH VIEN ===");
        System.out.println("Ma SV: " + id);
        System.out.println("Ho ten: " + name);
        // Gọi hàm hiển thị của Address
        this.address.display(); 
    }
}

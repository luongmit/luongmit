/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Product {
    String id, name;
    double price;
    int quantity;

    public void input(Scanner sc) {
        System.out.print("Nhap ID: "); id = sc.nextLine();
        System.out.print("Nhap Ten SP: "); name = sc.nextLine();
        System.out.print("Nhap Gia: "); price = sc.nextDouble();
        System.out.print("Nhap So luong: "); quantity = sc.nextInt();
    }

    public double getTotalPrice() { return price * quantity; }
    
    public void discount(double percent) {
        price = price - (price * percent / 100);
    }

    public void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Price: " + price + " - Qty: " + quantity);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        p.input(sc);

        p.display();

        System.out.println("Tong tien (Goc): " + p.getTotalPrice());

        System.out.println("\n--- AP DUNG GIAM GIA 10% ---");
        p.discount(10);
        p.display();
        System.out.println("Tong tien (Sau giam): " + p.getTotalPrice());
    }
}

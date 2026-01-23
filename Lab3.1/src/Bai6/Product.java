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
    private String id, name;
    private double price;
    private int quantity;

    public void input(Scanner sc) {
        System.out.print("Nhap ID: "); id = sc.nextLine();
        System.out.print("Nhap Ten SP: "); name = sc.nextLine();
        System.out.print("Nhap Gia: "); price = sc.nextDouble();
        System.out.print("Nhap So luong: "); quantity = sc.nextInt();
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void discount(double percent) {

        this.price = this.price - (this.price * percent / 100);
    }

    public void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Price: " + price + " - Qty: " + quantity);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        p.input(sc);
        
        System.out.println("Tong tien ban dau: " + p.getTotalPrice());
        
        p.discount(10);
        System.out.println("Sau khi giam gia 10%:");
        p.display();
    }
}

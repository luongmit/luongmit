/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Book {
    String title, author;
    double price;
    int year;

    public void input(Scanner sc) {
        System.out.print("Nhap Tieu de: "); title = sc.nextLine();
        System.out.print("Nhap Tac gia: "); author = sc.nextLine();
        System.out.print("Nhap Gia ban: "); price = sc.nextDouble();
        System.out.print("Nhap Nam XB: "); year = sc.nextInt();
    }

    public void display() {
        System.out.println("Sach: " + title + " - Tac gia: " + author + " - Gia: " + price + " - Nam: " + year);
    }

    public boolean isExpensive() {
        return price > 200000;
    }

    public boolean isOldBook() {
        return year < 2015;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Book sach = new Book();
        sach.input(sc);
        
        System.out.println("\n--- THONG TIN SACH ---");
        sach.display();
        
        if (sach.isExpensive()) {
            System.out.println("-> Day la sach GIA CAO");
        }
        
        if (sach.isOldBook()) {
            System.out.println("-> Day la sach xuat ban TRUOC NAM 2015");
        }
    }
}

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
    private String title;
    private String author;
    private double price;
    private int year;

    public void input(Scanner sc) {
        System.out.print("Tieu de: "); title = sc.nextLine();
        System.out.print("Tac gia: "); author = sc.nextLine();
        System.out.print("Gia ban: "); price = sc.nextDouble();
        System.out.print("Nam XB: "); year = sc.nextInt();
    }

    public void display() {
        System.out.println("Title: " + title + " - Author: " + author + " - Price: " + price + " - Year: " + year);
    }

    public boolean isExpensive() {
        return price > 200000;
    }

    public boolean isOldBook() {
        return year < 2015;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        b.input(sc);
        b.display();
        
        if(b.isExpensive()) System.out.println("-> Sach DAT");
        else System.out.println("-> Sach BINH DAN");
        
        if(b.isOldBook()) System.out.println("-> Sach CU");
        else System.out.println("-> Sach MOI");
    }
}

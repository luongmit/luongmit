/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author 1000l
 */
public class Book {
    private String title;
    private double price;
    private Author author;

    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public void display() {
        System.out.println("Sach: " + title);
        System.out.println("Gia: " + price);
        author.display();
    }
}

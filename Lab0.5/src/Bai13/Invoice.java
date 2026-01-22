/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai13;

/**
 *
 * @author 1000l
 */
public class Invoice {
    String invoiceId;
    double amount;
    Customer13 customer;

    public Invoice(String invoiceId, double amount, Customer13 customer) {
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.customer = customer;
    }

    public void display() {
        System.out.println("--- HOA DON ---");
        System.out.println("Ma HD: " + invoiceId);
        customer.display();
        System.out.println("Thanh tien: " + amount);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12;

/**
 *
 * @author 1000l
 */
public class Order {
    String orderId;
    Product product;

    public Order(String orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
    }

    public double getTotal() {
        return product.price;
    }

    public void display() {
        System.out.println("Don hang: " + orderId);
        System.out.println("SanPham: " + product.productName);
        System.out.printf("Tong tien: %.0f\n", getTotal());
    }
}

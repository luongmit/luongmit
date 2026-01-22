/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai13;

/**
 *
 * @author 1000l
 */
public class Customer13{
    String id, name;

    public Customer13(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void display() {
        System.out.println("Khach hang: " + name + " (" + id + ")");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author 1000l
 */
public class Bai6_Main {
    public static void main(String[] args) {
        Room p = new Room("Phong Khach", 36.5);
        House nha = new House("69", p);
        nha.display();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

/**
 *
 * @author 1000l
 */
public class Bai10_Main {
    public static void main(String[] args) {
        Time gioBay = new Time(14, 30);
        Flight mb = new Flight("VN123", gioBay);
        mb.display();
    }
}

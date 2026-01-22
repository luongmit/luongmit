/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai11;

/**
 *
 * @author 1000l
 */
public class Bai11_Main {
    public static void main(String[] args) {
        Teacher11 gv = new Teacher11("Tien si Luong", "PhD");
        Subject mon = new Subject("Lap trinh Java", gv);
        mon.display();
    }
}

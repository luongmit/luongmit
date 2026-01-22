/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai14;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        if (s == null || s.trim().isEmpty()) {
            System.out.println("So tu: 0");
        } else {
            String[] words = s.trim().split("\\s+");
            System.out.println("So tu: " + words.length);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Bai2_TanSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        System.out.println("Tan suat xuat hien:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println("'" + (char) i + "': " + count[i]);
            }
        }
    }
}

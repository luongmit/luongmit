/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author 1000l
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri: ");
            list.add(sc.nextInt());
        }

        System.out.println("Mang: " + list);

        if (!list.isEmpty()) {
            System.out.println("Min: " + Collections.min(list));
        }

        int sum = 0;
        for (int x : list) sum += x;
        System.out.println("Tong: " + sum);

        System.out.print("Nhap chi so k can xoa: ");
        int k = sc.nextInt();
        if (k >= 0 && k < list.size()) {
            list.remove(k);
            System.out.println("Da xoa tai " + k + ". Mang: " + list);
        }

        System.out.print("Nhap vi tri k de chen sau: ");
        k = sc.nextInt();
        System.out.print("Nhap gia tri x: ");
        int x = sc.nextInt();
        if (k >= 0 && k < list.size()) {
            list.add(k + 1, x);
            System.out.println("Sau khi chen: " + list);
        }

        list.sort(Collections.reverseOrder());
        System.out.println("Sap xep giam dan: " + list);

        if (!list.isEmpty()) {
            int maxVal = Collections.max(list);

            list.removeIf(val -> val == maxVal);
            System.out.println("Sau khi xoa cac so Max (" + maxVal + "): " + list);
        }
    }
}

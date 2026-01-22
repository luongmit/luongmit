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

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Mang vua nhap: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Tong cac phan tu: " + sum);

        int countNeg = 0;
        for (int x : arr) if (x < 0) countNeg++;
        System.out.println("So luong so am: " + countNeg);

        System.out.print("Cac so chinh phuong: ");
        double sumCP = 0;
        int countCP = 0;
        for (int x : arr) {
            if (checkChinhPhuong(x)) {
                System.out.print(x + " ");
                sumCP += x;
                countCP++;
            }
        }
        System.out.println();
        if (countCP > 0) {
            System.out.println("TBC so chinh phuong: " + (sumCP / countCP));
        } else {
            System.out.println("Khong co so chinh phuong.");
        }

        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Max: " + max + " - Min: " + min);

        System.out.print("Cac so nam trong khoang (" + min + ", " + max + "): ");
        for (int x : arr) {
            if (x > min && x < max) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public static boolean checkChinhPhuong(int n) {
        if (n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}

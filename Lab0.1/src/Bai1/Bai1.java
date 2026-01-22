/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double x;
        
        System.out.print("Nhap so nguyen duong n: ");
        n = sc.nextInt();
        
        System.out.print("Nhap so thuc x: ");
        x = sc.nextDouble();

        System.out.println("\n--- KET QUA TINH TOAN ---");
        System.out.printf("1. S = %.4f\n", tinhCau1(n));
        System.out.printf("2. S = %.4f\n", tinhCau2(n));
        System.out.printf("3a. S (1+3+6...) = %d\n", tinhCau3a(n));
        System.out.printf("3b. S (1+3+5...) = %d\n", tinhCau3b(n));
        System.out.printf("4. S = %.4f\n", tinhCau4(n, x));
        System.out.printf("5. S (Cos Taylor) = %.6f\n", tinhCau5(n, x));
        System.out.printf("6. S (e^x Taylor) = %.6f\n", tinhCau6(n, x));
    }

    public static long giaiThua(int k) {
        long gt = 1;
        for (int i = 1; i <= k; i++) {
            gt *= i;
        }
        return gt;
    }

    public static double tinhCau1(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        return s;
    }

    public static double tinhCau2(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / (2 * i);
        }
        return s;
    }


    public static long tinhCau3a(int n) {
        long s = 1; 
        for (int i = 1; i <= n; i++) {
            s += 3 * i;
        }
        return s;
    }


    public static long tinhCau3b(int n) {
        long s = 0;

        for (int i = 0; i <= n; i++) {
            s += (2 * i + 1);
        }
        return s;
    }

    public static double tinhCau4(int n, double x) {
        double s = 0;

        for (int i = 0; i <= n; i++) {
            s += Math.pow(x, i);
        }
        return s;
    }

    public static double tinhCau5(int n, double x) {
        double s = 0;
        for (int i = 0; i <= n; i++) {

            double tuSo = Math.pow(x, 2 * i);

            long mauSo = giaiThua(2 * i);

            double term = tuSo / mauSo;

            if (i % 2 == 0) {
                s += term;
            } else {
                s -= term;
            }
        }
        return s;
    }

    public static double tinhCau6(int n, double x) {
        double s = 0; 
        for (int i = 0; i <= n; i++) {
            double tuSo = Math.pow(x, i);
            long mauSo = giaiThua(i);
            s += tuSo / mauSo;
        }
        return s;
    }
}

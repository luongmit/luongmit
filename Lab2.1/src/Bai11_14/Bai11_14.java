/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai11_14;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

// BÀI 11: Tổng mảng
class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Tong mang: " + sum);
    }
}

// BÀI 12: Min - Max
class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

// BÀI 13: Đảo ngược chuỗi
class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        System.out.println("Chuoi dao nguoc: " + sb.reverse().toString());
    }
}

// BÀI 14: Hàm kiểm tra số nguyên tố
class Bai14 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Cac so nguyen to tu 1 den 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

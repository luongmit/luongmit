/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6_10;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

// BÀI 6: In từ 1 đến 100
class Bai6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
}

// BÀI 7: Tính tổng 1 đến n
class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tong 1.." + n + " la: " + sum);
    }
}

// BÀI 8: Bảng cửu chương
class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n (1-9): ");
        int n = sc.nextInt();
        
        System.out.println("Bang cuu chuong " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}

// BÀI 9: Đếm số chữ số
class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong: ");
        int n = sc.nextInt();

        String s = String.valueOf(n);
        System.out.println("So chu so la: " + s.length());

    }
}

// BÀI 10: Kiểm tra số nguyên tố
class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) System.out.println(n + " la so nguyen to.");
        else System.out.println(n + " KHONG phai so nguyen to.");
    }
}

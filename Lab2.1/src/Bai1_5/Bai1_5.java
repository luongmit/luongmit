/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_5;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

// BÀI 1: In ra màn hình
class Bai1 {
    public static void main(String[] args) {
        System.out.println("Xin chao Java!");
        System.out.println("Toi dang hoc lap trinh Java.");
    }
}

// BÀI 2: Tính tổng hai số
class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        System.out.println("Tong: " + (a + b));
    }
}

// BÀI 3: Kiểm tra chẵn lẻ
class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " la so CHAN.");
        } else {
            System.out.println(n + " la so LE.");
        }
    }
}

// BÀI 4: Chu vi, Diện tích Hình chữ nhật
class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();
        
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }
}

// BÀI 5: So sánh hai số
class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = sc.nextDouble();
        
        if (a > b) {
            System.out.println("So lon hon la: " + a);
        } else if (b > a) {
            System.out.println("So lon hon la: " + b);
        } else {
            System.out.println("Hai so bang nhau.");
        }
    }
}

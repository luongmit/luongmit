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

public class Student {

    String id, name;
    double score;

    public void input(Scanner sc) {
        System.out.print("Nhap ID: "); id = sc.nextLine();
        System.out.print("Nhap Ten: "); name = sc.nextLine();
        System.out.print("Nhap Diem: "); score = sc.nextDouble();
        sc.nextLine();
    }

    public void display() {
        System.out.println("SV: " + name + " (" + id + ") - Diem: " + score);
    }

    public boolean isPass() {
        return score >= 5.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student sv = new Student();

        sv.input(sc);

        sv.display();

        if (sv.isPass()) {
            System.out.println("Sinh vien DAT");
        } else {
            System.out.println("Sinh vien KHONG DAT");
        }
    }
}

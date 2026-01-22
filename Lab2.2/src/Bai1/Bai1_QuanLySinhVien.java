/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.util.Scanner;
/**
 *
 * @author 1000l
 */
public class Bai1_QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien n: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Student[] list = new Student[n];

        double sumScore = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin SV thu " + (i + 1) + ":");
            System.out.print("  Ma SV: ");
            String id = sc.nextLine();
            System.out.print("  Ten: ");
            String name = sc.nextLine();
            System.out.print("  Diem: ");
            double score = sc.nextDouble();
            sc.nextLine(); 

            list[i] = new Student(id, name, score);
            sumScore += score;
        }

        double avg = (n > 0) ? sumScore / n : 0;
        System.out.printf("Diem trung binh ca lop: %.2f\n", avg);

        System.out.println("\n--- KET QUA ---");
        System.out.printf("%-10s %-20s %-10s %-10s\n", "Ma", "Ten", "Diem", "Trang Thai");
        for (Student s : list) {
            String status = (s.score >= 5) ? "DAT" : "KHONG DAT";
            System.out.printf("%-10s %-20s %-10.1f %-10s\n", s.id, s.name, s.score, status);
        }
    }
}

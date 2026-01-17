/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab21;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author 1000l
 */
public class Câu4 { 

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Class SinhVien (đặt static để dùng được trong main)
    static class SinhVien {
        String ten;
        double diem;

        public SinhVien(String ten, double diem) {
            this.ten = ten;
            this.diem = diem;
        }

        public String xepLoai() {
            if (diem >= 8.0) return "Giỏi";
            if (diem >= 6.5) return "Khá";
            if (diem >= 5.0) return "Trung bình";
            return "Yếu";
        }
    }

    public static void main(String[] args) {
        Scanner scanner;

        // --- CẤU HÌNH HIỂN THỊ TIẾNG VIỆT (UTF-8) ---
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
            scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            System.out.println("Lỗi cấu hình UTF-8, dùng mặc định.");
            scanner = new Scanner(System.in);
        }
        // ---------------------------------------------

        System.out.println("--- Bài 14: Số nguyên tố 1-100 ---");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("--- Bài 15: Quản lý sinh viên ---");
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Xử lý trôi dòng

        ArrayList<SinhVien> danhSach = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("--- Nhập thông tin SV thứ " + (i + 1) + " ---");
            System.out.print("Tên: ");
            String ten = scanner.nextLine();
            
            System.out.print("Điểm: ");
            double diem = scanner.nextDouble();
            scanner.nextLine(); // Xử lý trôi dòng sau khi nhập điểm
            
            danhSach.add(new SinhVien(ten, diem));
        }

        if (danhSach.isEmpty()) {
            System.out.println("\nChưa có dữ liệu sinh viên nào!");
        } else {
            double tongDiem = 0;
            SinhVien svMax = danhSach.get(0); 

            System.out.println("\n--- KẾT QUẢ ---");
            // Căn lề trái (%) cho chuỗi, căn lề phải cho số
            System.out.printf("%-20s %-10s %-15s\n", "Tên", "Điểm", "Xếp loại");
            
            for (SinhVien sv : danhSach) {
                System.out.printf("%-20s %-10.1f %-15s\n", sv.ten, sv.diem, sv.xepLoai());
                tongDiem += sv.diem;

                if (sv.diem > svMax.diem) {
                    svMax = sv;
                }
            }
            System.out.println("----------------------------------------");
            System.out.printf("Điểm trung bình cả lớp: %.2f\n", (tongDiem / n));
            System.out.println("Sinh viên điểm cao nhất: " + svMax.ten + " (" + svMax.diem + ")");
        }
    }
}
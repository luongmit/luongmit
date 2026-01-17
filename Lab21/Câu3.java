/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab21;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author 1000l
 */
public class Câu3 {

    /**
     * @param args the command line arguments
     */
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

        System.out.println("--- Bài 11 & 12: Mảng số nguyên ---");
        System.out.print("Nhập số phần tử mảng n: ");
        int n = scanner.nextInt();
        
        // Kiểm tra n hợp lệ
        if (n <= 0) {
            System.out.println("Mảng phải có ít nhất 1 phần tử!");
        } else {
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            int max = arr[0];
            int min = arr[0];

            for (int x : arr) {
                sum += x;
                if (x > max) max = x;
                if (x < min) min = x;
            }
            System.out.println("Tổng mảng: " + sum);
            System.out.println("Giá trị lớn nhất (Max): " + max);
            System.out.println("Giá trị nhỏ nhất (Min): " + min);
        }

        System.out.println("\n--- Bài 13: Đảo ngược chuỗi ---");
        // Quan trọng: Lệnh này để xử lý trôi dòng do nextInt() ở trên để lại ký tự Enter
        scanner.nextLine(); 
        
        System.out.print("Nhập chuỗi cần đảo: ");
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder(text);
        System.out.println("Chuỗi đảo ngược: " + sb.reverse().toString());
    }
}
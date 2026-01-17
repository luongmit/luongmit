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
public class Câu2 {

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

        System.out.println("--- Bài 6: In từ 1 đến 100 ---");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Xuống dòng sau khi in xong

        System.out.println("\n--- Bài 7: Tính tổng từ 1 đến n ---");
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);

        System.out.println("\n--- Bài 8: Bảng cửu chương ---");
        System.out.print("Nhập n (1-9): ");
        int cuuChuong = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", cuuChuong, i, cuuChuong * i);
        }

        System.out.println("\n--- Bài 9: Đếm số chữ số ---");
        System.out.print("Nhập số nguyên dương: ");
        int number = scanner.nextInt();
        String strNum = String.valueOf(number);
        System.out.println("Số chữ số: " + strNum.length());

        System.out.println("\n--- Bài 10: Kiểm tra số nguyên tố ---");
        System.out.print("Nhập số cần kiểm tra nguyên tố: ");
        int p = scanner.nextInt();
        boolean isPrime = true;
        if (p < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(p); i++) {
                if (p % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(p + " là số nguyên tố.");
        } else {
            System.out.println(p + " không phải số nguyên tố.");
        }
    }
}
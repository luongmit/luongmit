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
public class Câu1 {

    public static void main(String[] args) {
        Scanner scanner;

        // --- BẮT ĐẦU CẤU HÌNH TIẾNG VIỆT ---
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
            scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            System.out.println("Lỗi cấu hình UTF-8, sử dụng mặc định.");
            scanner = new Scanner(System.in);
        }
        // --- KẾT THÚC CẤU HÌNH ---

        System.out.println("--- Bài 1 ---");
        System.out.println("Xin\nchào Java!");
        System.out.println("Tôi\nđang học lập trình Java.");

        System.out.println("\n--- Bài 2 ---");
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("Tổng: " + (a + b));

        System.out.println("\n--- Bài 3 ---");
        System.out.print("Nhập số cần kiểm tra: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }

        System.out.println("\n--- Bài 4 ---");
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        System.out.println("Chu vi: " + (dai + rong) * 2);
        System.out.println("Diện tích: " + (dai * rong));

        System.out.println("\n--- Bài 5 ---");
        System.out.print("Nhập số x: ");
        double x = scanner.nextDouble();
        System.out.print("Nhập số y: ");
        double y = scanner.nextDouble();
        if (x > y) {
            System.out.println("Số lớn hơn là: " + x);
        } else if (y > x) {
            System.out.println("Số lớn hơn là: " + y);
        } else {
            System.out.println("Hai số bằng nhau.");
        }
    }
}
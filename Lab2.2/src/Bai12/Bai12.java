/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12;

/**
 *
 * @author 1000l
 */
public class Bai12 {
    public static void main(String[] args) {
        int[] arr = {123, 45, 9, 2024};

        for (int num : arr) {
            System.out.println(num + " -> Tong chu so: " + sumDigits(num));
        }
    }

    public static int sumDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Bai3_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        
        if (checkArmstrong(n)) {
            System.out.println(n + " LA so Armstrong.");
        } else {
            System.out.println(n + " KHONG PHAI so Armstrong.");
        }
    }

    public static boolean checkArmstrong(int n) {
        int original = n;
        int sum = 0;

        int digits = String.valueOf(n).length(); 

        while (n > 0) {
            int lastDigit = n % 10; 
            sum += Math.pow(lastDigit, digits); 
            n = n / 10; 
        }

        return sum == original;
    }
}

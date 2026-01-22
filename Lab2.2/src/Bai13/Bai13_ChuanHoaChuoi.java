/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai13;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Bai13_ChuanHoaChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap chuoi can chuan hoa: ");
        String input = sc.nextLine();
        
        System.out.println("Ket qua: " + normalizeString(input));
    }

    public static String normalizeString(String str) {

        String[] words = str.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {

                String firstChar = word.substring(0, 1).toUpperCase();
                String otherChars = word.substring(1).toLowerCase();

                result.append(firstChar).append(otherChars).append(" ");
            }
        }

        return result.toString().trim();
    }
}

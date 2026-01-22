/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

public class Bai4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap xau ky tu: ");
        String s = sc.nextLine();

        int letters = 0, digits = 0;
        int sumDigits = 0;
        StringBuilder numbersOnly = new StringBuilder(); 
        
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) letters++;
            if(Character.isDigit(c)) {
                digits++;
                sumDigits += Character.getNumericValue(c);
                numbersOnly.append(c).append(" ");
            }
        }
        System.out.println("So chu cai: " + letters);
        System.out.println("So chu so: " + digits);

        String s3 = s.replaceAll("gmail\\.com", "@gmail.com"); 

        System.out.println("Cau 3: " + s3);

        StringBuilder s4 = new StringBuilder(s);
        for(int i = 0; i < s4.length() - 1; i++) {
            char c1 = s4.charAt(i);
            char c2 = s4.charAt(i+1);
            if(Character.isDigit(c1) && Character.isDigit(c2)) {
                if((c1 - '0') % 2 == 0 && (c2 - '0') % 2 == 0) {
                    s4.insert(i+1, '-');
                    i++;
                }
            }
        }
        System.out.println("Cau 4: " + s4);

        String s5 = s.replace("gmail.com", "ctech.edu.vn");
        System.out.println("Cau 5: " + s5);

        String[] words = s.trim().split("\\s+");
        System.out.print("Cau 6 (Cac tu): ");
        for(String w : words) System.out.print("[" + w + "] ");
        System.out.println();

        StringBuilder s7 = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) s7.append(Character.toLowerCase(c));
            else if(Character.isLowerCase(c)) s7.append(Character.toUpperCase(c));
            else s7.append(c);
        }
        System.out.println("Cau 7: " + s7);

        System.out.println("Cau 8: Cac so la " + numbersOnly + "| Tong = " + sumDigits);

        StringBuilder s9 = new StringBuilder();
        for(String w : words) {
            if(!w.isEmpty()) {
                String first = w.substring(0, 1).toUpperCase();
                String remain = w.substring(1).toLowerCase();
                s9.append(first).append(remain).append(" ");
            }
        }
        System.out.println("Cau 9: " + s9.toString().trim());

        System.out.println("Cau 10: " + new StringBuilder(s).reverse());

        String maxWord = "";
        for(String w : words) {
            if(w.length() > maxWord.length()) maxWord = w;
        }
        System.out.println("Cau 11 (Tu dai nhat): " + maxWord);
    }
}

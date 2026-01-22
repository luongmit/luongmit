/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai20;

/**
 *
 * @author 1000l
 */
import java.util.Random;
import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int target = rand.nextInt(100) + 1; 
        int count = 0;
        int maxGuess = 7;
        boolean win = false;

        System.out.println("DA SINH SO BI MAT (1-100). BAN CO 7 LAN DOAN!");

        while (count < maxGuess) {
            System.out.print("Lan " + (count + 1) + " - Nhap so cua ban: ");
            int guess = sc.nextInt();
            count++;

            if (guess == target) {
                System.out.println("CHUC MUNG! Ban da doan dung so " + target);
                win = true;
                break;
            } else if (guess < target) {
                System.out.println("-> So bi mat LON HON so ban doan.");
            } else {
                System.out.println("-> So bi mat NHO HON so ban doan.");
            }
        }

        if (!win) {
            System.out.println("GAME OVER! So bi mat la: " + target);
        }
    }
}

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
public class Bai1_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student sv = new Student();
        
        sv.input(sc);
        sv.display();
        
        sc.close();
    }
}

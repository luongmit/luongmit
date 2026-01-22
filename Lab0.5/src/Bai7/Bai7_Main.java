/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;
import java.util.Scanner;
/**
 *
 * @author 1000l
 */
public class Bai7_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer cust = new Customer();
        cust.input(sc);
        cust.display();
    }
}

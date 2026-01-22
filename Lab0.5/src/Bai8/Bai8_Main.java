/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;
import java.util.Scanner;
/**
 *
 * @author 1000l
 */
public class Bai8_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("admin", "123");
        User user = new User("Tran Gia Luong", acc);
        
        user.login(sc);
    }
}

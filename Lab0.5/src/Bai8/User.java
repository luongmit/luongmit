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
public class User {
    private String name;
    private Account account;

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void login(Scanner sc) {
        System.out.println("Xin chao " + name + ", vui long dang nhap:");
        System.out.print("Username: "); String u = sc.nextLine();
        System.out.print("Password: "); String p = sc.nextLine();

        if (account.checkLogin(u, p)) {
            System.out.println("-> Dang nhap THANH CONG!");
        } else {
            System.out.println("-> Dang nhap THAT BAI!");
        }
    }
}

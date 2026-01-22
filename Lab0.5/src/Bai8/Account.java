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
public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkLogin(String u, String p) {
        return u.equals(this.username) && p.equals(this.password);
    }
}

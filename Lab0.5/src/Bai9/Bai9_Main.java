/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;
import java.util.Scanner;
/**
 *
 * @author 1000l
 */
public class Bai9_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student9 st = new Student9("Tran Gia Luong");
        st.inputScore(sc);
        st.display();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
public class Bai3_Main {
    public static void main(String[] args) {
        Department dept = new Department("CNTT", "Cong Nghe Thong Tin");
        StudentB3 sv = new StudentB3("6140371", "Tran Gia Luong", dept);
        sv.display();
    }
}

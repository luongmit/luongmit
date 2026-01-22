/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai15;

/**
 *
 * @author 1000l
 */
public class Bai15_Main {
    public static void main(String[] args) {

        Teacher gv = new Teacher("Co Lien", "Ba Trum");

        ClassRoom lop = new ClassRoom("CNTT K14", gv);

        Student15 sv = new Student15("Tran Gia Luong", lop);

        System.out.println("=== THONG TIN QUAN LY ===");
        sv.display();
    }
}

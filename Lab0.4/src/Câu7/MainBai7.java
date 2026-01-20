/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu7;

/**
 *
 * @author 1000l
 */
public class MainBai7 {
    public static void main(String[] args) {
        Address addr = new Address("Quang Thien", "Ninh Binh");
        StudentV2 sv = new StudentV2("6140371", "Tran Gia Luong", addr);
        sv.display();
    }
}

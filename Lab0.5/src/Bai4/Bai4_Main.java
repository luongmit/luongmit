/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author 1000l
 */
public class Bai4_Main {
    public static void main(String[] args) {
        Author tg = new Author("Nam Cao", "namcao@vhh.vn");
        Book sach = new Book("Chi Pheo", 50000, tg);
        sach.display();
    }
}

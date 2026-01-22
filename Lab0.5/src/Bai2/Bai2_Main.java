/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author 1000l
 */
public class Bai2_Main {
    public static void main(String[] args) {
        // Tạo đối tượng ngày sinh
        MyDate date = new MyDate(19, 10, 2005);
        
        // Tạo nhân viên và gán ngày sinh
        Employee emp = new Employee("6140371", "Tran Gia Luong", date);
        
        // Hiển thị
        emp.display();
    }
}

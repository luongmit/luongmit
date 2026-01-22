/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai15;

/**
 *
 * @author 1000l
 */
public class Student15 {
    private String name;
    private ClassRoom classRoom; // Sinh viên thuộc lớp học

    public Student15(String name, ClassRoom classRoom) {
        this.name = name;
        this.classRoom = classRoom;
    }

    public void display() {
        System.out.println("Sinh vien: " + name);
        // Gọi hiển thị của ClassRoom
        if (classRoom != null) {
            classRoom.display();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai15;

/**
 *
 * @author 1000l
 */
public class ClassRoom {
    private String className;
    private Teacher teacher; // Lớp học có giáo viên

    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
    }

    public void display() {
        System.out.println("  Lop: " + className);
        // Gọi hiển thị của Teacher
        if (teacher != null) {
            teacher.display();
        }
    }
}

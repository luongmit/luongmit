/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
public class StudentB3 {
    private String id;
    private String name;
    private Department department;

    public StudentB3(String id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void display() {
        System.out.println("Sinh vien: " + name + " - MSSV: " + id);
        department.display();
    }
}

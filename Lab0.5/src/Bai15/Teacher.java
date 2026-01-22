/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai15;

/**
 *
 * @author 1000l
 */
public class Teacher {
    private String name;
    private String degree;

    public Teacher(String name, String degree) {
        this.name = name;
        this.degree = degree;
    }

    public void display() {
        System.out.println("   GVCN: " + name + " (" + degree + ")");
    }
}

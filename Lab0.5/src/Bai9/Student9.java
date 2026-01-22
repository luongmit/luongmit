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
public class Student9 {
    String name;
    Score score;

    public Student9(String name) {
        this.name = name;
        this.score = new Score();
    }

    public void inputScore(Scanner sc) {
        System.out.println("Nhap diem cho " + name + ":");
        score.input(sc);
    }

    public void display() {
        System.out.println("Hoc sinh: " + name);
        System.out.println("Diem TB: " + score.getAverage());
    }
}

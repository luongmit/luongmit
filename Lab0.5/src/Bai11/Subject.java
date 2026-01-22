/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai11;

/**
 *
 * @author 1000l
 */
public class Subject {
    String subjectName;
    Teacher11 teacher;

    public Subject(String subjectName, Teacher11 teacher) {
        this.subjectName = subjectName;
        this.teacher = teacher;
    }

    public void display() {
        System.out.println("Mon hoc: " + subjectName);
        teacher.display();
    }
}

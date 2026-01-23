/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author 1000l
 */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Ten: " + name + ", Tuoi: " + age);
    }
}

class Student extends Person {
    String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ten: " + name + ", Tuoi: " + age + ", MSSV: " + studentId);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student s = new Student("Tran Gia Luong", 20, "6140371");
        s.displayInfo();
    }
}

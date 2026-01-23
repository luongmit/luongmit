/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

/**
 *
 * @author 1000l
 */
class Person8 {
    String name;
    public Person8(String name) { this.name = name; }

    public void introduce() {
        System.out.println("Xin chao, toi ten la " + name);
    }
}

class Teacher extends Person8 {
    String subject;
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Toi hoc mon " + subject); 
    }
}

public class Main8 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Luong", "Java");
        t.introduce();
    }
}

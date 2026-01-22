/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author 1000l
 */
public class Employee {
    private String id;
    private String name;
    private MyDate birthDate; // HAS-A MyDate

    // Constructor nhận vào đối tượng MyDate
    public Employee(String id, String name, MyDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    
    // Setter để gán ngày sinh (theo yêu cầu đề bài)
    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Ten: " + name);
        System.out.print("Ngay sinh: ");
        birthDate.display();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai14;

/**
 *
 * @author 1000l
 */
public class Department14 {
    String deptId, deptName;

    public Department14(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
    public void display() {
        System.out.println("Phong ban: " + deptName);
    }
}

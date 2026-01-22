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
public class Score {
    double math, physics, chemistry;

    public void input(Scanner sc) {
        System.out.print("Diem Toan: "); math = sc.nextDouble();
        System.out.print("Diem Ly: "); physics = sc.nextDouble();
        System.out.print("Diem Hoa: "); chemistry = sc.nextDouble();
    }

    public double getAverage() {
        return (math + physics + chemistry) / 3.0;
    }
}

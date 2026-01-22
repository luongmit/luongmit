/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

/**
 *
 * @author 1000l
 */
public class Bai10 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 20, 4, 8};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Khong ton tai so lon thu hai");
        } else {
            System.out.println("So lon thu hai la: " + max2);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai16;

/**
 *
 * @author 1000l
 */
public class Bai16 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 6;

        System.out.println("Cac cap co tong = " + k + ":");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}

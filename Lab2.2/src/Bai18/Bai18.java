/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai18;

/**
 *
 * @author 1000l
 */
public class Bai18 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;
        int sumMain = 0;
        int sumAnti = 0;

        for (int i = 0; i < n; i++) {
            sumMain += matrix[i][i];          
            sumAnti += matrix[i][n - 1 - i];  
        }

        System.out.println("Tong cheo chinh: " + sumMain); 
        System.out.println("Tong cheo phu: " + sumAnti);   
    }
}

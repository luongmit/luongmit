/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;
import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap cap ma tran n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        System.out.println("Nhap cac phan tu cua ma tran:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("matrix[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMa tran vua nhap:");
        printMatrix(matrix, n);

        int sum = 0;
        for(int[] row : matrix) for(int x : row) sum += x;
        System.out.println("Tong ma tran: " + sum);

        System.out.print("Nhap hang k can tim max (0 den " + (n-1) + "): ");
        int k = sc.nextInt();
        if(k >= 0 && k < n) {
            int maxRow = matrix[k][0];
            for(int x : matrix[k]) if(x > maxRow) maxRow = x;
            System.out.println("Max hang " + k + ": " + maxRow);
        }

        System.out.print("Nhap cot k can dem so am: ");
        int colK = sc.nextInt();
        int countNeg = 0;
        if(colK >= 0 && colK < n) {
            for(int i=0; i<n; i++) if(matrix[i][colK] < 0) countNeg++;
            System.out.println("So luong so am cot " + colK + ": " + countNeg);
        }

        System.out.print("So CP tren duong cheo chinh: ");
        for(int i=0; i<n; i++) {
            if(checkChinhPhuong(matrix[i][i])) System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        double sumPhu = 0;
        int countPhu = 0;
        for(int i=0; i<n; i++) {
            int val = matrix[i][n-1-i];
            if(150 % val == 0) { 
                sumPhu += val;
                countPhu++;
            }
        }
        if(countPhu > 0) System.out.println("TBC uoc cua 150 tren cheo phu: " + (sumPhu/countPhu));

        System.out.println("Ma tran sau khi sap xep hang giam dan:");
        for(int i=0; i<n; i++) {
            Arrays.sort(matrix[i]);
            for(int start=0, end=n-1; start<end; start++, end--) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
            }
        }
        printMatrix(matrix, n);
    }

    public static void printMatrix(int[][] matrix, int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean checkChinhPhuong(int n) {
        if (n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
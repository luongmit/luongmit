/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author 1000l
 */
import java.util.HashSet;
import java.util.Set;

public class Bai7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        Set<Integer> set = new HashSet<>();

        for (int x : a) set.add(x);

        for (int x : b) set.add(x);

        System.out.println("Mang sau khi gop va loai trung:");
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}

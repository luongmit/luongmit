/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

/**
 *
 * @author 1000l
 */
public class Time {
    int hour, minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void display() {
        System.out.printf("%02d:%02d\n", hour, minute);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

/**
 *
 * @author 1000l
 */
public class Flight {
    String flightCode;
    Time departureTime;

    public Flight(String flightCode, Time departureTime) {
        this.flightCode = flightCode;
        this.departureTime = departureTime;
    }

    public void display() {
        System.out.print("Chuyen bay " + flightCode + " khoi hanh luc: ");
        departureTime.display();
    }
}

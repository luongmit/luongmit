/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author 1000l
 */
public class House {
    private String houseId;
    private Room room;

    public House(String houseId, Room room) {
        this.houseId = houseId;
        this.room = room;
    }

    public void display() {
        System.out.println("Ma nha: " + houseId);
        room.display();
    }
}

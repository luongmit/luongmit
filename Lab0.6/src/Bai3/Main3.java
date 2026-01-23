/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
class Animal {
    protected String name; 

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Dong vat phat ra am thanh...");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " sua: Gau gau!");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Cau Vang");
        myDog.sound();
    }
}

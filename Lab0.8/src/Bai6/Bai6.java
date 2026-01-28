/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author 1000l
 */
interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void run();
}

class Dog implements Mammal {
    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    @Override
    public void run() {
        System.out.println("Dog runs fast");
    }
}
public class Bai6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
    }
}

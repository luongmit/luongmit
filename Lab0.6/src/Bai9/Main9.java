/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;

/**
 *
 * @author 1000l
 */
class Animal9 {
    public void makeSound() {
        System.out.println("Dong vat phat ra am thanh");
    }
}

class Dog9 extends Animal9 {
    @Override
    public void makeSound() {
        System.out.println("Cho sua: Gau gau");
    }
}

class Cat9 extends Animal9 {
    @Override
    public void makeSound() {
        System.out.println("Meo keu: Meo meo");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Animal9 animal;

        animal = new Dog9();
        animal.makeSound();

        animal = new Cat9();
        animal.makeSound();
    }
}

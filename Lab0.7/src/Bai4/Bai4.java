/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author 1000l
 */
abstract class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public abstract void makeSound();
    public abstract void move();
    public void show() {
        System.out.print(name + ": ");
        makeSound();
        System.out.print(" | ");
        move();
        System.out.println();
    }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override public void makeSound() { System.out.print("Gau gau"); }
    @Override public void move() { System.out.print("Chay"); }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }
    @Override public void makeSound() { System.out.print("Meo meo"); }
    @Override public void move() { System.out.print("Di nhe"); }
}

class Bird extends Animal {
    public Bird(String name) { super(name); }
    @Override public void makeSound() { System.out.print("Liu lo"); }
    @Override public void move() { System.out.print("Bay"); }
}

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("=== BAI 4: DONG VAT ===");
        new Dog("Cho").show();
        new Cat("Meo").show();
        new Bird("Chim").show();
    }
}

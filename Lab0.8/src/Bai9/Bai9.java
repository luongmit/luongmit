/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;

/**
 *
 * @author 1000l
 */
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Human implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human: Dang lam viec van phong...");
    }

    @Override
    public void eat() {
        System.out.println("Human: Dang an com trua...");
    }
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot: Dang lap rap linh kien co khi...");
    }
}

class Android implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Android: Dang xu ly du lieu may tinh...");
    }

    @Override
    public void eat() {
        System.out.println("Android: Dang tu sac dien (Eating)...");
    }

    @Override
    public void sleep() {
        System.out.println("Android: Chuyen sang che do cho (Sleeping)...");
    }
}

public class Bai9 {
    public static void main(String[] args) {
        System.out.println("=== KIEM TRA HUMAN ===");
        Human human = new Human();
        human.work();
        human.eat();
        System.out.println("\n=== KIEM TRA ROBOT ===");
        Robot robot = new Robot();
        robot.work();
        System.out.println("\n=== KIEM TRA ANDROID ===");
        Android android = new Android();
        android.work();
        android.eat();
        android.sleep();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author 1000l
 */
abstract class BankAccount {
    protected String accNum;
    protected double balance;
    public BankAccount(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Khong du tien rut!");
    }
    public abstract double calculateInterest();
    public void show() {
        System.out.printf("TK: %s | So du: %.0f | Lai: %.0f\n", accNum, balance, calculateInterest());
    }
}

class SavingAccount extends BankAccount {
    public SavingAccount(String n, double b) { super(n, b); }
    @Override public double calculateInterest() { return balance * 0.05; }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String n, double b) { super(n, b); }
    @Override public double calculateInterest() { return balance * 0.01; }
}

public class Bai5 {
    public static void main(String[] args) {
        System.out.println("=== BAI 5: NGAN HANG ===");
        SavingAccount sa = new SavingAccount("TK01", 1000);
        CheckingAccount ca = new CheckingAccount("TK02", 2000);
        sa.deposit(500);
        ca.withdraw(100);
        sa.show();
        ca.show();
    }
}

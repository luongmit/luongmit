/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author 1000l
 */
public class BankAccount {
    String accountNumber, ownerName;
    double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("-> Da nap: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("-> Da rut: " + amount);
        } else {
            System.out.println("-> So du khong du de rut " + amount);
        }
    }

    public double checkBalance() { return balance; }

    public void display() {
        System.out.println("STK: " + accountNumber + " - Chu TK: " + ownerName + " - So du: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("6140371", "Tran Gia Luong", 1000000);

        acc.display();

        System.out.println("\n--- GIAO DICH ---");

        acc.deposit(500000);
        System.out.println("So du hien tai: " + acc.checkBalance());

        acc.withdraw(200000);
        System.out.println("So du hien tai: " + acc.checkBalance());

        acc.withdraw(5000000); 
    }
}

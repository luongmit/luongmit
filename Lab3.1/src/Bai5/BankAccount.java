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
    private String accountNumber;
    private String ownerName;
    private double balance; 

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nap thanh cong " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rut thanh cong " + amount);
        } else {
            System.out.println("So du khong du de rut!");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void display() {
        System.out.println("STK: " + accountNumber + " - Chu TK: " + ownerName + " - So du: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("6140371", "Tran Gia Luong", 500000);
        acc.display();
        
        acc.deposit(200000); 
        acc.withdraw(1000000); 
        acc.withdraw(100000); 
        
        System.out.println("So du hien tai: " + acc.checkBalance());
    }
}

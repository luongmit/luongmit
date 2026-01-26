/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

/**
 *
 * @author 1000l
 */
import java.util.ArrayList;

abstract class PaymentMethod {
    protected String method;
    public PaymentMethod(String m) { method = m; }
    public abstract boolean pay(double amount);
    public void printReceipt(double amount) {
        System.out.println("Bien lai: " + method + " - " + amount + " VND");
    }
}

class Cash extends PaymentMethod {
    public Cash() { super("Tien mat"); }
    @Override public boolean pay(double amount) { return true; }
}

class CreditCard extends PaymentMethod {
    private double limit;
    public CreditCard(double limit) { super("The Tin Dung"); this.limit = limit; }
    @Override public boolean pay(double amount) {
        if(amount <= limit) { limit -= amount; return true; }
        return false;
    }
}

class EWallet extends PaymentMethod {
    private double balance;
    public EWallet(double balance) { super("Vi Dien Tu"); this.balance = balance; }
    @Override public boolean pay(double amount) {
        if(amount <= balance) { balance -= amount; return true; }
        return false;
    }
}

public class Bai10 {
    public static void main(String[] args) {
        System.out.println("=== BAI 10: THANH TOAN ===");
        ArrayList<PaymentMethod> list = new ArrayList<>();
        list.add(new Cash());
        list.add(new CreditCard(5000));
        list.add(new EWallet(1000));

        double bill = 2000;
        for(PaymentMethod pm : list) {
            if(pm.pay(bill)) pm.printReceipt(bill);
            else System.out.println(pm.method + ": That bai (Khong du tien)");
        }
    }
}

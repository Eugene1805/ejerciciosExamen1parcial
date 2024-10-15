package org.example.payment;

public abstract class OnlinePayment implements Payment {
    protected double amount;

    public OnlinePayment(double amount) {}

    public double getAmount() {
        return amount;
    }

    public abstract void processPayment();


}

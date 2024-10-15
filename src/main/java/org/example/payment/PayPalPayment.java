package org.example.payment;

public class PayPalPayment extends OnlinePayment{
    private String email;
    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Email: " + email + " Amount: " + getAmount());
    }
}

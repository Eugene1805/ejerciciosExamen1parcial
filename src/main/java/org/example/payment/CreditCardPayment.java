package org.example.payment;

public class CreditCardPayment extends OnlinePayment{
    private String cardNumber;
    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Card number: " + cardNumber + " Amount:" + getAmount());
    }
}

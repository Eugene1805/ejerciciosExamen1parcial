package org.example.payment;

public class Main {
    public static void main(String[] args) {
        PayPalPayment onlinePayment = new PayPalPayment(1500.80, "eugene@gmail.com");
        CreditCardPayment creditCardPayment = new CreditCardPayment(1500.80, "3412 0092 1415");
        onlinePayment.processPayment();
        creditCardPayment.processPayment();
    }
}

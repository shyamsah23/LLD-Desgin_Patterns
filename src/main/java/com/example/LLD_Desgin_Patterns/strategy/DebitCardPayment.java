package com.example.LLD_Desgin_Patterns.strategy;

import org.springframework.stereotype.Component;

@Component("debit-Card")
public class DebitCardPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return "Payment Done for Amount" + amount + "By Debit Card";
    }
}

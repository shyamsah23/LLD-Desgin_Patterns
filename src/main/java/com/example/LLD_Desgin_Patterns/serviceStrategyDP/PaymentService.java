package com.example.LLD_Desgin_Patterns.serviceStrategyDP;

import com.example.LLD_Desgin_Patterns.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentService {

    private final Map<String, PaymentStrategy> paymentStrategy;

    public PaymentService(Map<String, PaymentStrategy> paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(String type, double amount) throws Exception {

        PaymentStrategy strategy = paymentStrategy.get(type);

        if (strategy == null) {
            throw new Exception("Invalid payment Method Type" + type);
        }

        strategy.pay(amount);
        return ;
    }
}

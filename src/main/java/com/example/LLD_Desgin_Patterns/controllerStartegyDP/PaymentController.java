package com.example.LLD_Desgin_Patterns.controllerStartegyDP;

import com.example.LLD_Desgin_Patterns.serviceStrategyDP.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    Logger log = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{type}/{amount}")
    public String makePayment(@PathVariable String type,@PathVariable double amount) throws Exception {
        log.info("Payment Request Received of type = {}",type);
        paymentService.processPayment(type,amount);
        return "Payment Done";
    }
}

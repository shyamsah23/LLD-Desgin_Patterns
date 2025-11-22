package com.example.LLD_Desgin_Patterns.factory;

import org.springframework.stereotype.Component;

@Component("Car")
public class Car implements Transport {

    @Override
    public String bookRide() {
        System.out.println("Ride Booked With Car");
        return "Ride Booked With Car";
    }
}

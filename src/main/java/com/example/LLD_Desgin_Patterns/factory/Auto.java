package com.example.LLD_Desgin_Patterns.factory;

import org.springframework.stereotype.Component;

@Component("auto")
public class Auto implements Transport {
    @Override
    public String bookRide() {
        System.out.println("Ride Booked With Auto");
        return "Ride Booked with Auto";
    }
}

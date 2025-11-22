package com.example.LLD_Desgin_Patterns.factory;


import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Transport {
    @Override
    public String bookRide() {
        System.out.println("Ride Booked With Bike");
        return "Ride Booked With Bike";
    }
}

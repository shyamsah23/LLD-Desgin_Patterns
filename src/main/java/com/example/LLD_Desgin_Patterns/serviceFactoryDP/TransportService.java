package com.example.LLD_Desgin_Patterns.serviceFactoryDP;

import com.example.LLD_Desgin_Patterns.factory.Transport;
import com.example.LLD_Desgin_Patterns.factory.TransportFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportService {

    @Autowired
    private TransportFactory transportFactory;

    public void bookRide(String type) throws Exception {
        Transport transport = transportFactory.getTransport(type);
        transport.bookRide();
        return;
    }
}

package com.example.LLD_Desgin_Patterns.factory;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TransportFactory {
    private final Map<String, Transport> transportMap;

    public TransportFactory(Map<String, Transport> transportMap) {
        this.transportMap = transportMap;
    }

    public Transport getTransport(String type) throws Exception {
        Transport transport = transportMap.get(type);
        if (transport == null) {
            throw new Exception("Invalid Transport Type!");
        }
        return transport;
    }
}

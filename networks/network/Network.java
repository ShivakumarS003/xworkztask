package com.xworkz.methodOverriding.networks.network;

public class Network {
    public void connect() {
        System.out.println("Network: Connecting");
    }

    public void transmit() {
        System.out.println("Network: Transmitting data");
    }

    public void receive() {
        System.out.println("Network: Receiving data");
    }

    public void authenticate() {
        System.out.println("Network: Authenticating user");
    }

    public void disconnect() {
        System.out.println("Network: Disconnecting");
    }
}

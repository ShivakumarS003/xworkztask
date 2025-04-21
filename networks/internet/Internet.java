package com.xworkz.methodOverriding.networks.internet;

import com.xworkz.methodOverriding.networks.network.Network;

public class Internet extends Network {
    @Override
    public void connect() {
        System.out.println("WiFiNetwork: Connecting to access point");
    }

    @Override
    public void transmit() {
        System.out.println("WiFiNetwork: Data sent wirelessly");
    }

    @Override
    public void receive() {
        System.out.println("WiFiNetwork: Receiving signals");
    }

    @Override
    public void authenticate() {
        System.out.println("WiFiNetwork: WPA2 authentication");
    }

    @Override
    public void disconnect() {
        System.out.println("WiFiNetwork: Disconnected safely");
    }
}

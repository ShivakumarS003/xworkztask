package com.xworkz.methodOverriding.networks;

import com.xworkz.methodOverriding.networks.internet.Internet;
import com.xworkz.methodOverriding.networks.network.Network;

public class InternetRunner {
    public static void main(String[] args) {
        Network network = new Network();
        network.connect();
        network.transmit();
        network.receive();
        network.authenticate();
        network.disconnect();

        Network network1 = new Internet();
        network1.connect();
        network1.transmit();
        network1.receive();
        network1.authenticate();
        network1.disconnect();

        Internet wifi = new Internet();
        wifi.connect();
        wifi.transmit();
        wifi.receive();
        wifi.authenticate();
        wifi.disconnect();
    }
}

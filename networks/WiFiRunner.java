package com.xworkz.inhertance.networks;

import com.xworkz.inhertance.networks.wifi.WiFi;

public class WiFiRunner {
    public static void main(String[] args) {
        WiFi wifi = new WiFi();
        wifi.connect();
    }
}

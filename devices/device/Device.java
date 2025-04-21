package com.xworkz.methodOverriding.devices.device;

public class Device {

        public void powerOn() {
            System.out.println("Device: Powering on");
        }

        public void initialize() {
            System.out.println("Device: Running self-check");
        }

        public void operate() {
            System.out.println("Device: Performing main function");
        }

        public void shutdown() {
            System.out.println("Device: Powering off");
        }

        public void statusReport() {
            System.out.println("Device: Status report complete");
        }
    }






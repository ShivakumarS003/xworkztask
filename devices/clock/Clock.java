package com.xworkz.methodOverriding.devices.clock;

import com.xworkz.methodOverriding.devices.device.Device;

public class Clock extends Device {


        @Override
        public void powerOn() {
            System.out.println("Clock: Display turning on");
        }

        @Override
        public void initialize() {
            System.out.println("Clock: Synchronizing time");
        }

        @Override
        public void operate() {
            System.out.println("Clock: Ticking time forward");
        }

        @Override
        public void shutdown() {
            System.out.println("Clock: Saving current time and shutting down");
        }
    }


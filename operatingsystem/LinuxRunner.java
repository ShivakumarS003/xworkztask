package com.xworkz.inhertance.operatingsystem;

import com.xworkz.inhertance.operatingsystem.linux.Linux;

public class LinuxRunner {
    public static void main(String[] args) {
        Linux lin = new Linux();
        lin.updateSystem();
    }
}

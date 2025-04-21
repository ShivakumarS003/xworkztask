package com.xworkz.methodOverriding.operatingsystems.linux;

import com.xworkz.methodOverriding.operatingsystems.os.Os;

public class Linux extends Os {
    @Override
    public void boot() {
        System.out.println("Windows: Starting Windows Bootloader");
    }

    @Override
    public void runProcesses() {
        System.out.println("Windows: Running Windows services");
    }

    @Override
    public void manageFiles() {
        System.out.println("Windows: Managing NTFS files");
    }

    @Override
    public void allocateMemory() {
        System.out.println("Windows: Allocating memory to .exe apps");
    }

    @Override
    public void shutdown() {
        System.out.println("Windows: Logging off and shutting down");
    }
}

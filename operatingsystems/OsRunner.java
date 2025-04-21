package com.xworkz.methodOverriding.operatingsystems;

import com.xworkz.methodOverriding.operatingsystems.linux.Linux;
import com.xworkz.methodOverriding.operatingsystems.os.Os;
import sun.plugin2.os.windows.Windows;

public class OsRunner {
    public static void main(String[] args) {
        Os os = new Os();
        os.boot();
        os.runProcesses();
        os.manageFiles();
        os.allocateMemory();
        os.shutdown();

        Os os2 = new Linux();
        os2.boot();
        os2.runProcesses();
        os2.manageFiles();
        os2.allocateMemory();
        os2.shutdown();

        Linux lin = new Linux();
        lin.boot();
        lin.runProcesses();
        lin.manageFiles();
        lin.allocateMemory();
        lin.shutdown();
    }
}

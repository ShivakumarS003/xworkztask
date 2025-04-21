package com.xworkz.methodOverriding.tools;

import com.xworkz.methodOverriding.tools.hammer.Hammer;
import com.xworkz.methodOverriding.tools.tool.Tool;

public class HammerRunner {
    public static void main(String[] args) {
        Tool tool = new Tool();
        tool.use();
        tool.repair();
        tool.store();
        tool.clean();
        tool.inspect();

        Tool tool1 = new Hammer();
        tool1.use();
        tool1.repair();
        tool1.store();
        tool1.clean();
        tool1.inspect();

        Hammer hammer = new Hammer();
        hammer.use();
        hammer.repair();
        hammer.store();
        hammer.clean();
        hammer.inspect();
    }
}

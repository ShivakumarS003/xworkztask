package com.xworkz.methodOverriding.viruses.corona;

import com.xworkz.methodOverriding.viruses.virus.Virus;

public class Corona extends Virus {
    @Override
    public void infect() {
        System.out.println("CoronaVirus: Attaching to respiratory tract cells");
    }

    @Override
    public void replicate() {
        System.out.println("CoronaVirus: Replicating rapidly inside lungs");
    }

    @Override
    public void mutate() {
        System.out.println("CoronaVirus: Frequently mutating into new variants");
    }

    @Override
    public void spread() {
        System.out.println("CoronaVirus: Spreading through droplets and surfaces");
    }

    @Override
    public void triggerImmuneResponse() {
        System.out.println("CoronaVirus: Triggering strong inflammatory response");
    }
}

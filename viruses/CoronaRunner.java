package com.xworkz.methodOverriding.viruses;

import com.xworkz.methodOverriding.viruses.corona.Corona;
import com.xworkz.methodOverriding.viruses.virus.Virus;

public class CoronaRunner {
    public static void main(String[] args) {
        Virus virus = new Virus();
        virus.infect();
        virus.replicate();
        virus.mutate();
        virus.spread();
        virus.triggerImmuneResponse();

        Virus virus1 = new Corona();
        virus1.infect();
        virus1.replicate();
        virus1.mutate();
        virus1.spread();
        virus1.triggerImmuneResponse();

        Corona corona = new Corona();
        corona.infect();
        corona.replicate();
        corona.mutate();
        corona.spread();
        corona.triggerImmuneResponse();
    }
}

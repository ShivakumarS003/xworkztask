package com.xworkz.methodOverriding.birds;

import com.xworkz.methodOverriding.birds.bird.Bird;
import com.xworkz.methodOverriding.birds.peacock.Peacock;

public class PeacockRunner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.sing();
        bird.buildNest();
        bird.layEggs();
        bird.eat();

        Bird bird1 = new Peacock();
        bird1.fly();
        bird1.sing();
        bird1.buildNest();
        bird1.layEggs();
        bird1.eat();

        Peacock parrot = new Peacock();
        parrot.fly();
        parrot.sing();
        parrot.buildNest();
        parrot.layEggs();
        parrot.eat();
    }
}

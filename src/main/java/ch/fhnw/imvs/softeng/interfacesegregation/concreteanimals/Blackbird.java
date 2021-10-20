package ch.fhnw.imvs.softeng.interfacesegregation.concreteanimals;

import ch.fhnw.imvs.softeng.interfacesegregation.animals.IBird;

public class Blackbird implements IBird {
    @Override
    public void breath() {
        System.out.println("i am a blackbird breathing air");
    }

    @Override
    public void eat() {
        System.out.println("mummf mummf uuum yesssss");
    }

    @Override
    public void fly() {
        System.out.println("i belive i can fly");
    }

    @Override
    public void move() {
        System.out.println("move bitch get out the way");
    }
}

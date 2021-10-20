package ch.fhnw.imvs.softeng.interfacesegregation.concreteanimals;

import ch.fhnw.imvs.softeng.interfacesegregation.animals.IFish;

public class Shark implements IFish {
    @Override
    public void eat() {
        System.out.println("give me those human legs");
    }

    @Override
    public void swim() {
        System.out.println("schwum schwum schwuuuuum");
    }
}

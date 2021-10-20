package ch.fhnw.imvs.softeng.interfacesegregation;

import ch.fhnw.imvs.softeng.interfacesegregation.concreteanimals.Dog;
import ch.fhnw.imvs.softeng.interfacesegregation.concreteanimals.Seal;
import ch.fhnw.imvs.softeng.interfacesegregation.concreteanimals.Shark;
import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanBreath;
import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanSwim;
import ch.fhnw.imvs.softeng.interfacesegregation.plant.Baobab;

import java.util.ArrayList;
import java.util.List;

public class InterfaceSegregation {

    public static void main(String[] args) {
        var breathables = List.of(new Baobab(), new Dog());
        breathables.forEach(ICanBreath::breath);

        var swimmables = List.of(new Shark(), new Seal());
        swimmables.forEach(ICanSwim::swim);
    }
}

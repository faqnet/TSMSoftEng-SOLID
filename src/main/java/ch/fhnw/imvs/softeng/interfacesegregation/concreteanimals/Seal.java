package ch.fhnw.imvs.softeng.interfacesegregation.concreteanimals;

import ch.fhnw.imvs.softeng.interfacesegregation.animals.IMammal;
import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanSwim;

public class Seal implements IMammal, ICanSwim {
    @Override
    public void swim() {
        System.out.println("schwup schup");
    }
}

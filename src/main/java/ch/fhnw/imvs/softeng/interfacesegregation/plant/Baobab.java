package ch.fhnw.imvs.softeng.interfacesegregation.plant;

import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanBreath;

public class Baobab implements ICanBreath {

    @Override
    public void breath() {
        System.out.println("do some super photosynthesis");
    }
}

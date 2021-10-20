package ch.fhnw.imvs.softeng.interfacesegregation.animals;

import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanEat;
import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanSwim;

public interface IFish extends ICanEat, ICanSwim {
}

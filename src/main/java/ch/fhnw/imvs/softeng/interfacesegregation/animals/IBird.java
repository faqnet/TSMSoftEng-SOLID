package ch.fhnw.imvs.softeng.interfacesegregation.animals;

import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanBreath;
import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanEat;
import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanFly;
import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanMove;

public interface IBird extends ICanEat, ICanMove, ICanFly, ICanBreath {


}

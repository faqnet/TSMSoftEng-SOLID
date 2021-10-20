package ch.fhnw.imvs.softeng.interfacesegregation.animals;

import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanBreath;
import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanEat;
import ch.fhnw.imvs.softeng.interfacesegregation.livingtraits.ICanMove;

public interface IMammal extends ICanMove, ICanBreath, ICanEat {
    @Override
    default void breath() {
        System.out.println("I like breathing while standing on the ground");
    }

    @Override
    default void eat() {
        System.out.println("yam yam yam yam");
    }

    @Override
    default void move() {
        System.out.println("vorwärts");
    }
}

package ch.fhnw.imvs.softeng.coffee.dirty;

import ch.fhnw.imvs.softeng.coffee.Coffee;

public interface ICoffeeMachine {

    void groundCoffeeBeans();

    void refillCoffeeBeans();

    Coffee brewCoffee();

    // void insertCapsule();
}

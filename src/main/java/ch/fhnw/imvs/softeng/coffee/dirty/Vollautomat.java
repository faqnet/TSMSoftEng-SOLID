package ch.fhnw.imvs.softeng.coffee.dirty;

import ch.fhnw.imvs.softeng.coffee.Coffee;
import ch.fhnw.imvs.softeng.coffee.sol1.IBeanMachine;
import ch.fhnw.imvs.softeng.coffee.sol1.IBrew;

public class Vollautomat implements ICoffeeMachine {
    @Override
    public Coffee brewCoffee() {
        return new Coffee();
    }

    @Override
    public void groundCoffeeBeans() {
        System.out.println("grind grind..");
    }

    @Override
    public void refillCoffeeBeans() {
        System.out.println("getting those beans");
    }
}

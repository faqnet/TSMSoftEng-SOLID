package ch.fhnw.imvs.softeng.coffee.dirty;

import ch.fhnw.imvs.softeng.coffee.Coffee;
import ch.fhnw.imvs.softeng.coffee.sol1.IBrew;
import ch.fhnw.imvs.softeng.coffee.sol1.ICapsuleMachine;

public class Nespresso implements ICoffeeMachine {
    @Override
    public void groundCoffeeBeans() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void refillCoffeeBeans() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Coffee brewCoffee() {
        return new Coffee();
    }

    public void insertCapsule() {
        System.out.println("schwups");
    }
}

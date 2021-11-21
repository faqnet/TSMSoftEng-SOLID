package ch.fhnw.imvs.softeng.coffee.sol1;

import ch.fhnw.imvs.softeng.coffee.Coffee;
import ch.fhnw.imvs.softeng.coffee.sol1.IBeanMachine;
import ch.fhnw.imvs.softeng.coffee.sol1.IBrew;

public class Vollautomat implements IBeanMachine, IBrew {
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

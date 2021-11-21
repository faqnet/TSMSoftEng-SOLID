package ch.fhnw.imvs.softeng.coffee.sol1;

import ch.fhnw.imvs.softeng.coffee.Coffee;
import ch.fhnw.imvs.softeng.coffee.sol1.IBrew;
import ch.fhnw.imvs.softeng.coffee.sol1.ICapsuleMachine;

public class Nespresso implements ICapsuleMachine, IBrew {
    @Override
    public Coffee brewCoffee() {
        return new Coffee();
    }

    public void insertCapsule() {
        System.out.println("schwups");
    }
}

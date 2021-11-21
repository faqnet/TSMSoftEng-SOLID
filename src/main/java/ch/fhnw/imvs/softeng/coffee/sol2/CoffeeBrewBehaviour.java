package ch.fhnw.imvs.softeng.coffee.sol2;

import ch.fhnw.imvs.softeng.coffee.Coffee;

public class CoffeeBrewBehaviour implements IBrewBehaviour{
    @Override
    public Coffee brew() {
        return new Coffee();
    }
}

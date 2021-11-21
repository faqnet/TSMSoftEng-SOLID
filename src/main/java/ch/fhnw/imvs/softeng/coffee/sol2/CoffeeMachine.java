package ch.fhnw.imvs.softeng.coffee.sol2;

import ch.fhnw.imvs.softeng.coffee.Coffee;

public class CoffeeMachine implements IRefillBehaviour, IBrewBehaviour {

    private final IRefillBehaviour refillBehaviour;
    private final IBrewBehaviour brewBehaviour;

    public CoffeeMachine(IRefillBehaviour refillBehaviour, IBrewBehaviour brewBehaviour) {
        this.refillBehaviour = refillBehaviour;
        this.brewBehaviour = brewBehaviour;
    }

    @Override
    public Coffee brew() {
        return brewBehaviour.brew();
    }

    @Override
    public void refill() {
        refillBehaviour.refill();
    }
}

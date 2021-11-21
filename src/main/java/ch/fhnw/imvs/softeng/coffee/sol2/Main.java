package ch.fhnw.imvs.softeng.coffee.sol2;

public class Main {
    public static void main(String[] args) {

        var vollautomat = new CoffeeMachine(new BeanRefillBehaviour(), new CoffeeBrewBehaviour());
        vollautomat.refill();
        System.out.println(vollautomat.brew().toString());

        var nespresso = new CoffeeMachine(new CapsuleRefillBehaviour(), new CoffeeBrewBehaviour());
        nespresso.refill();
        System.out.println(nespresso.brew().toString());

    }
}

package ch.fhnw.imvs.softeng.coffee.sol1;

import ch.fhnw.imvs.softeng.coffee.sol1.IBrew;
import ch.fhnw.imvs.softeng.coffee.sol1.Nespresso;
import ch.fhnw.imvs.softeng.coffee.sol1.Vollautomat;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var vollautomat = new Vollautomat();
        vollautomat.refillCoffeeBeans();
        vollautomat.groundCoffeeBeans();
        System.out.println(vollautomat.brewCoffee().toString());

        var nespresso = new Nespresso();
        nespresso.insertCapsule();
        System.out.println(nespresso.brewCoffee());
        var coffemachines = List.of(nespresso, vollautomat);
        coffemachines.forEach(IBrew::brewCoffee);

    }
}

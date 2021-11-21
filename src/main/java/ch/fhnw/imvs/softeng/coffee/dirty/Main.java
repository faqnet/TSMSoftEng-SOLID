package ch.fhnw.imvs.softeng.coffee.dirty;

public class Main {

    public static void main(String[] args) {

        var vollautomat = new Vollautomat();
        vollautomat.refillCoffeeBeans();
        vollautomat.groundCoffeeBeans();
        System.out.println(vollautomat.brewCoffee().toString());


    }
}

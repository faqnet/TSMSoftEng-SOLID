package ch.fhnw.imvs.softeng.dependencyinversion;

import ch.fhnw.imvs.softeng.dependencyinversion.animals.Animal;
import ch.fhnw.imvs.softeng.dependencyinversion.behaviourtraits.CatEatBehaviour;
import ch.fhnw.imvs.softeng.dependencyinversion.behaviourtraits.CatMoveBehaviour;
import ch.fhnw.imvs.softeng.dependencyinversion.behaviourtraits.DogEatBehaviour;
import ch.fhnw.imvs.softeng.dependencyinversion.behaviourtraits.DogMoveBehaviour;

public class DependencyInversion {

    public static void main(String[] args) {
        var dog = new Animal(new DogEatBehaviour(), new DogMoveBehaviour());
        var cat = new Animal(new CatEatBehaviour(), new CatMoveBehaviour());
        System.out.println("cat makes:");
        cat.eat();
        cat.move();
        System.out.println("dog makes:");
        dog.eat();
        dog.move();
    }
}

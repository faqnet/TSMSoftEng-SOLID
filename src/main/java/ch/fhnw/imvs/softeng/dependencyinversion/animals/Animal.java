package ch.fhnw.imvs.softeng.dependencyinversion.animals;

import ch.fhnw.imvs.softeng.dependencyinversion.behaviourtraits.IEatBehaviour;
import ch.fhnw.imvs.softeng.dependencyinversion.behaviourtraits.IMoveBehaviour;

public class Animal implements IEatBehaviour, IMoveBehaviour {

    private final IEatBehaviour eatBehaviour;
    private final IMoveBehaviour moveBehaviour;

    public Animal(
            IEatBehaviour eatBehaviour,
            IMoveBehaviour moveBehaviour
    ) {
        this.eatBehaviour = eatBehaviour;
        this.moveBehaviour = moveBehaviour;
    }

    @Override
    public void eat() {
        this.eatBehaviour.eat();
    }

    @Override
    public void move() {
        this.moveBehaviour.move();
    }
}

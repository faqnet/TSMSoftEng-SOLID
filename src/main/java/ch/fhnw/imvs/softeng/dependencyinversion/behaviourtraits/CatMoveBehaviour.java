package ch.fhnw.imvs.softeng.dependencyinversion.behaviourtraits;

public class CatMoveBehaviour implements IMoveBehaviour{
    @Override
    public void move() {
        System.out.println("Run");
    }
}

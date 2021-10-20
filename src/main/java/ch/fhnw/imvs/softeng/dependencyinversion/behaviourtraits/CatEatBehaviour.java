package ch.fhnw.imvs.softeng.dependencyinversion.behaviourtraits;

public class CatEatBehaviour implements IEatBehaviour{
    @Override
    public void eat() {
        System.out.println("yam yam");
    }
}

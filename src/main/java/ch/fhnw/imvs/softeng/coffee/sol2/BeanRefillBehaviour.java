package ch.fhnw.imvs.softeng.coffee.sol2;

public class BeanRefillBehaviour implements IRefillBehaviour {
    @Override
    public void refill() {
        addBeans();
        groundBeans();
    }

    private void groundBeans() {
        System.out.println("grinding grinding");
    }

    private void addBeans() {
        System.out.println("adding beans");
    }
}

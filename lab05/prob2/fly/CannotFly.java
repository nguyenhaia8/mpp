package lab05.prob2.fly;

public class CannotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("\tcannot fly");
    }
}

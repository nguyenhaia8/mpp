package lab05.prob2.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("\tsqueaking");
    }
}

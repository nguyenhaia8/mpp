package lab05.prob2;

import lab05.prob2.fly.FlyBehavior;
import lab05.prob2.quack.QuackBehavior;

public abstract class Duck implements FlyBehavior, QuackBehavior {
    public abstract void display();

    public void swim() {
        System.out.println("\tswimming");
    }

    public void fly() {
        DuckBehaviorFactory.getFlyBehavior(this).fly();
    }

    public void quack() {
        DuckBehaviorFactory.getQuackBehavior(this).quack();
    }
}

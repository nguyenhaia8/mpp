package lab05.prob2;

import lab05.prob2.fly.CannotFly;
import lab05.prob2.fly.FlyBehavior;
import lab05.prob2.fly.FlyWithWings;
import lab05.prob2.quack.MuteQuack;
import lab05.prob2.quack.Quack;
import lab05.prob2.quack.QuackBehavior;
import lab05.prob2.quack.Squeak;

import java.util.HashMap;

public class DuckBehaviorFactory {
    static HashMap<Class<? extends Duck>, FlyBehavior> flyBehaviors = new HashMap<>();
    static HashMap<Class<? extends Duck>, QuackBehavior> quackBehaviors = new HashMap<>();

    static {
        flyBehaviors.put(MallardDuck.class, new FlyWithWings());
        flyBehaviors.put(RedheadDuck.class, new FlyWithWings());
        flyBehaviors.put(DecoyDuck.class, new CannotFly());
        flyBehaviors.put(RubberDuck.class, new CannotFly());

        quackBehaviors.put(MallardDuck.class, new Quack());
        quackBehaviors.put(RedheadDuck.class, new Quack());
        quackBehaviors.put(DecoyDuck.class, new MuteQuack());
        quackBehaviors.put(RubberDuck.class, new Squeak());
    }

    public static FlyBehavior getFlyBehavior(Duck duck) {
        Class<? extends Duck> duckClass = duck.getClass();
        if (!flyBehaviors.containsKey(duckClass)) {
            throw new IllegalArgumentException("No FlyBehavior registered for " + duckClass);
        }
        return flyBehaviors.get(duckClass);
    }
    public static QuackBehavior getQuackBehavior(Duck duck) {
        Class<? extends Duck> duckClass = duck.getClass();
        if (!quackBehaviors.containsKey(duckClass)) {
            throw new IllegalArgumentException("No QuackBehavior registered for " + duckClass);
        }
        return quackBehaviors.get(duckClass);
    }
}

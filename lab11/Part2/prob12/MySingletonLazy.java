package lab11.Part2.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static Optional<MySingletonLazy> instance = Optional.empty();
    private MySingletonLazy() {}
    public static MySingletonLazy getInstance() {
        instance = Optional.ofNullable(instance.orElseGet(MySingletonLazy::new));

        return instance.get();
    }

    public static void main(String[] args) {
        MySingletonLazy firstInstance = MySingletonLazy.getInstance();
        MySingletonLazy secondInstance = MySingletonLazy.getInstance();

        System.out.println("firstInstance = " + firstInstance);
        System.out.println("secondInstance = " + secondInstance);
        System.out.println("Same instance? " + (firstInstance == secondInstance));
    }
}

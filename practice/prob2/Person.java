package practice.prob2;

public class Person {
    private final String name;
    private final Passport passport;

    public Person(String name) {
        this.name = name;
        this.passport = new Passport(this);
    }

    public Passport getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }
}

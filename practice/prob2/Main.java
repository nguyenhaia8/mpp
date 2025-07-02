package practice.prob2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("bob");
        System.out.println(person.getPassport().getPassportNumber());
    }
}

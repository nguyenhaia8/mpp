package practice.prob2;

public class Passport {
    private final String passportNumber;
    private final Person person;

    public Passport(Person person) {
        this.person = person;
        this.passportNumber = generateNumber();
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public Person getPerson() {
        return person;
    }

    private String generateNumber() {
        return String.format("%06d", (int) (Math.random() * 10000));
    }
}

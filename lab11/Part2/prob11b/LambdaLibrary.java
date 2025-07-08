package lab11.Part2.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> FILTER_EMPLOYEES =
            (employees, minSalary, lastNameStart) -> employees.stream()
                    .filter(e -> e.getSalary() > minSalary)
                    .filter(e -> e.getLastName().charAt(0) > lastNameStart)
                    .map(e -> e.getFirstName() + " " + e.getLastName())
                    .sorted()
            .collect(Collectors.joining(", "));
}

package examFinal.question8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T extends Medication> void printMedicationNames(List<T> list) {
        list.forEach(item -> System.out.println(item.getName()));
    }
    public static void main(String[] args) {
        List<Medication> medications = Arrays.asList(
                new Medication("Saline"),
                new Medication("Vitamin C")

        );

        List<Painkiller> painkillers = Arrays.asList(
                new Painkiller("Ibuprofen"),
                new Painkiller("Aspirin")
        );

        List<Antibiotic> antibiotics = Arrays.asList(
                new Antibiotic("Amoxicillin")
        );
        printMedicationNames(medications);
        printMedicationNames(painkillers);
        printMedicationNames(antibiotics);
    }
}

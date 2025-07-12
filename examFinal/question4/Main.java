package examFinal.question4;

import java.util.Comparator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> beverageSugarMap = Map.ofEntries(
                Map.entry("Cold Brew Coffee", "0"),
                Map.entry("Iced Green Tee", "12"),
                Map.entry("Sparkling Water", "N/A"),
                Map.entry("Lemonade", "28"),
                Map.entry("Berry Smoothie", "N/A"),
                Map.entry("Chai latte", "22"),
                Map.entry("Cononut Water", "15"),
                Map.entry("Apple Juice", "34"),
                Map.entry("Classic Soda", "40"),
                Map.entry("Orange Juice", "23"),
                Map.entry("Detox Green Smoothie", "16")
        );

        beverageSugarMap.entrySet().stream()
                .map(e -> Map.entry(e.getKey(), convertStringToInt(e.getValue())))
                .filter(e-> e.getKey().contains("Juice") || e.getKey().contains("Smoothie"))
                .filter(e->e.getValue() >= 0 && e.getValue() <= 30)
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e-> System.out.println(e.getKey() + ": " + e.getValue()));

    }

    private static Integer convertStringToInt(String input) {
        Integer result = 0;
        try {
            result = Integer.parseInt(input);
            return result;
        } catch (NumberFormatException e) {
//            throw new RuntimeException("Input is not an integer");
        }
        return -1;
    }




}

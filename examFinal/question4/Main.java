//package examFinal.question4;
//
//import java.util.Comparator;
//import java.util.Map;
//import java.util.Optional;
//
//public class Main {
//    public static void main(String[] args) {
//        Map<String, String> beverageSugarMap = Map.ofEntries(
//                Map.entry("Cold Brew Coffee", "0"),
//                Map.entry("Iced Green Tee", "12"),
//                Map.entry("Sparkling Water", "N/A"),
//                Map.entry("Lemonade", "28"),
//                Map.entry("Berry Smoothie", "N/A"),
//                Map.entry("Chai latte", "22"),
//                Map.entry("Cononut Water", "15"),
//                Map.entry("Apple Juice", "34"),
//                Map.entry("Classic Soda", "40"),
//                Map.entry("Orange Juice", "23"),
//                Map.entry("Detox Green Smoothie", "16")
//        );
//
//
//
////        beverageSugarMap.entrySet().stream()
////                .filter(e-> convertStringToInt(e.getValue()).orElse(40) < 30)
////                .forEach(e-> System.out.println(e.getKey() + " " + e.getValue()));
//
//
//
//
//        beverageSugarMap.entrySet().stream()
//                .map(e -> Map.entry(e.getKey(), convertStringToInt(e.getValue())))
//                .map(e-> {
//                    if (e.getValue().equals("N/A")) {
//                        return Map.entry(e.getKey(), "N/Aaaa");
//                    } else {
//                        return Map.entry(e.getKey(), e.getValue());
//                    }
//                })
//                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue().));
//
//
//    }
//
//    private static Optional<Integer> convertStringToInt(String input) {
//        Optional<Integer> result = Optional.empty();
//        try {
//            result = Optional.of(Integer.parseInt(input));
//            return result;
//        } catch (RuntimeException e) {
////            throw new RuntimeException();
//        }
//        return result;
//    }
//
//
//
//
//}

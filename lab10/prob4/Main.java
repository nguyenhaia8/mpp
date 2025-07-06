package lab10.prob4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("cozy", "cool", "deal", "cold", "apple", "cat");
        int res = WordFilter.countWords(list, 'c', 'd', 4);
        System.out.println("Count = " + res);
    }
}

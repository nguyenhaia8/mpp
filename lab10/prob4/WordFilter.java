package lab10.prob4;

import java.util.List;

public class WordFilter {
    public static int countWords(List<String> words, char c, char d, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len && word.indexOf(c) >=0 && word.indexOf(d) == -1) {
                count++;
            }
        }
        return count;
    }
}

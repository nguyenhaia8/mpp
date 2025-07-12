package lab13.prob5;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Main {
    public static <T extends Comparable<? super T>> T secondSmallest (List<T> list) {
        if (list == null) {
            throw new NullPointerException("List cannot be null");
        }
        if (list.size() < 2) {
            throw new IllegalArgumentException("List must have at least 2 elements");
        }

        T smallest = null;
        T secondSmallest = null;
        for (T element : list) {
            Objects.requireNonNull(element, "List cannot contain null elements");

            if (smallest == null) {
                smallest = element;
            } else if (element.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = element;
            } else if (secondSmallest == null || element.compareTo(secondSmallest) < 0) {
                if (!element.equals(smallest)) {
                    secondSmallest = element;
                }
            }
        }
        if (secondSmallest == null) {
            throw new NoSuchElementException("All elements in the list are equal");
        }
        return secondSmallest;
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(secondSmallest(numbers));

        List<Double> nums = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        System.out.println(secondSmallest(nums));
    }
}

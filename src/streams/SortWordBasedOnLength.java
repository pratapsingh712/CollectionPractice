package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortWordBasedOnLength {

    public static void main(String[] args) {

        List<String> word = Arrays.asList("apple", "banana", "cherry", "date", "fig");

        // sorting happens in ascending by default using the sorted() method

        List<String> ascending = word.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println("Sorted list in ascending order :"+ascending+"\n");

        // now let's sort reverse descending

        List<String> descending = word.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());

        System.out.println("Sorted list in descending order :"+descending);
    }
}

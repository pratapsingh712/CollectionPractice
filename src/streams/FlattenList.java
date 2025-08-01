package streams;

import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {

    public static void main(String[] args) {

        List<List<String>> nested = List.of(
                List.of("a","b"),
                List.of("c","d"),
                List.of("e")
        );

        // flattening -> ek list jisme sare inner elements aa jaye list ke wo process is flattening

        List<String> flat = nested.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flat);

        // now let's try out flattening the word of string

        System.out.println("********************Flat Fruit**********************");

        List<List<String>> input = List.of(
                List.of("apple", "banana"),
                List.of("banana", "cherry"),
                List.of("apple", "date")
        );

        List<String> flatFruit = input.stream()
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(flatFruit);
    }
}

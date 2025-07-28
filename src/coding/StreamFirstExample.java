package coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFirstExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Raghav","Pratap","Singh","Alice", "Bob", "Charlie", "Anna");

        List<String> result = names.stream() // Source
                .filter(name -> name.startsWith("P"))  // Intermediate Operation
                .filter(name -> name.startsWith("A"))  // Intermediate Operation
                .map(String::toUpperCase)                    // Intermediate operation
                .collect(Collectors.toList());               // Termination operation

        System.out.println(result);

    }
}

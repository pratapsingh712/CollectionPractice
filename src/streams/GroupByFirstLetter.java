package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {

    public static void main(String[] args) {

        List<String> word = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado");

        // now I have the list of fruits basically print it below first
        System.out.println();
        for(String fruit : word)
        {
            System.out.println(fruit);
        }

        // now let's group by first character

        System.out.println("After mapping the character into separate groups :");

        Map<Character, List<String>> groups = word.stream().collect(Collectors.groupingBy(letter -> letter.charAt(0)));

        groups.forEach((letter,group)-> System.out.println(letter+" => "+group));
    }
}

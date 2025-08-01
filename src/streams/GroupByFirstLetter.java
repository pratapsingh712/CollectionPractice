package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {

    public static void main(String[] args) {

        List<String> word = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado");

        // let's print the list of fruits without grouping

        for(String words : word)
        {
            System.out.println("Fruit :"+words);
        }

        // now let's group them by first letter of the fruit

        Map<Character, List<String>> group = word.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));

        // now i have collected all the fruits with their first letter into the map key as first char and value as list of fruit

        System.out.println();

        // one way is by using the simple for each with entry set
        for(Map.Entry<Character,List<String>> entry : group.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        // another way is to print using the lambda in foreach Map.For(key, value)) -> action )

        System.out.println("******************Using Lambda*************************");
        group.forEach((letter, groupFruit) -> System.out.println(letter+" : "+groupFruit));

    }
}

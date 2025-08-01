package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {

        List<String> word = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        // print the original list first

        for(String words : word)
        {
            System.out.println("Fruit :"+words);
        }

        System.out.println("****************print below the count of words**********************");

        Map<String, Long> coutingWord = word.stream()
                .collect(Collectors.groupingBy(
                        words -> words,
                        Collectors.counting()
                ));

        coutingWord.forEach((k,v)-> System.out.println(k+" : "+v));

    }
}

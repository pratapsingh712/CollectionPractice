package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> wordFrequency = new HashMap<>();

        System.out.println("Please enter any sentence to count the number of frequency for each word:");
        String sentence = sc.nextLine();

        sentence = sentence.toLowerCase();

        String []words = sentence.split(" ");

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // now let's print the map

        for(Map.Entry<String,Integer> entry : wordFrequency.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}

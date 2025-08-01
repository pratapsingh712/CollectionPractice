package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertCase {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("ross","sam","John","Jonny","Rox","Mandy");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Original name list :"+names+"\n");
        System.out.println("Converted to uppercase list of names :"+upperNames);

        // let's see if filter can be employed here too ?

        List<String> upperNamesFilter = names.stream().filter(str -> Boolean.parseBoolean(str.toUpperCase())).collect(Collectors.toList());



    }
}

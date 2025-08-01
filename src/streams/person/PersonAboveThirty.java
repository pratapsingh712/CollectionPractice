package streams.person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonAboveThirty {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("John",29),
                new Person("Doe",39),
                new Person("Mike",49),
                new Person("Tylor",19),
                new Person("Justin",59),
                new Person("Banki",18));

        System.out.println();
        System.out.println("Original list of people :");

        for(Person p : people){
            System.out.println(p);
        }

        // let's get people whose age is above 30

        List<String> midAge = people.stream()
                .filter(age -> age.getAge()>30)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("People who are mid age are : \n");
        for(String mid : midAge)
        {
            System.out.println(mid);
        }
    }
}

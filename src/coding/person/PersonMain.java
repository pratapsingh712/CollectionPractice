package coding.person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class PersonMain {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person(26,"Raghav","Bangalore"),
                new Person(25,"Alice","New York"),
                new Person(30,"Bob","London"),
                new Person(25,"Charlie","New York"),
                new Person(40,"Diana","Paris"),
                new Person(30,"Ethan","London"));


        List<String> olderPeopleList = people.stream()
                .filter(person -> person.getAge() >= 30)
                .map(Person::getName)// // Method reference is a shorthand for p -> p.getName()
                .collect(Collectors.toList());

        System.out.println(olderPeopleList);

        //Now let's group people by their city of residence

        Map<String, Long> peopleByCity = people.stream().collect(groupingBy(Person::getCity, counting()));

        System.out.println(peopleByCity);

        // Now lets the sum of total age from the list

        int totalAge = people.stream().mapToInt(Person::getAge).sum();

        System.out.println("Total age found in the group is : = "+totalAge);

        // Now let's how we can achieve the same using reduce

        int totalAgeReduceFunction = people.stream()
                .mapToInt(Person::getAge)
                .reduce(0,(subtotal,sum)-> subtotal+sum);

        System.out.println("Total age found in the group using Reduce : = "+totalAgeReduceFunction);


        // Now let's see if we have people from china or not


        Optional<Person> personFromChina = people.stream()
                .filter(p -> "china".equals(p.getCity()))
                .findAny(); // findFirst() would also work

        personFromChina.ifPresent(person -> {
            System.out.println("Found a person from China : "+ person.getName());
        });

    }
}

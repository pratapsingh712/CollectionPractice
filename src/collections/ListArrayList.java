package collections;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Doe");
        names.add("Julie");
        names.add("Rock");
        names.add("Andie");
        names.add("Celina");

        System.out.println("Original list :");
        for(String name: names)
        {
            System.out.println("Name "+name);
        }

        // adding a new name to index 2

        names.add(2,"Gopal");
        System.out.println();

        System.out.println("List after adding new name at index 2 ");

        for(String name : names)
        {
            System.out.println("Name "+name);
        }

        //removing name by its value and by its index

        System.out.println();
        System.out.println("List after removing name Arindum by it's value :");
        names.remove("Celina");
        for(String obj : names)
        {
            System.out.println("Name "+obj);
        }

        // removing name by its index
        names.remove(1);
        System.out.println();
        System.out.println("After removing name by it's index 1:");

        for(String name : names)
        {
            System.out.println("Names "+name);
        }
    }
}

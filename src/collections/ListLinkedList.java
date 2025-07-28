package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListLinkedList {

    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("John");
        names.add("Doe");
        names.add("Julie");
        names.add("Rock");
        names.add("Andie");
        names.add("Celina");

        // printing the list

        for(String name : names)
        {
            System.out.println("Name "+name);
        }

        // adding a new name at index 3

        names.add(3, "Pratap");
        System.out.println();
        System.out.println("After adding a new name at index 3 new list of names are :");
        for(String name : names)
        {
            System.out.println("Name : "+name);
        }

        // let's remove one name by value and one by it's index position
        names.remove("Celina");
        names.remove(4);
        System.out.println();
        System.out.println("After removing Tarun and Index 4 new list of names are :");
        for(String name : names)
        {
            System.out.println("Name : "+name);
        }

        // Now let's print the list using for-each, for, and an iterator
        System.out.println();
        System.out.println("Printing names using traditional for loop");

        for(int i=0;i<names.size();i++)
        {
            System.out.println("Names :"+names.get(i));
        }

        // by using the iterator
        System.out.println();
        System.out.println("Printing the list using the iterator :");

        Iterator<String> itr = names.iterator();
        while(itr.hasNext())
        {
            System.out.println("Name "+ itr.next());
        }

        // using for each
        System.out.println();
        System.out.println("Pring the list using the for each loop :");

        for(String name : names)
        {
            System.out.println("Name : "+name);
        }
    }
}

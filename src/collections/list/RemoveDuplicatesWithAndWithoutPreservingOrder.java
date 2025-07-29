package collections.list;

import java.util.*;

public class RemoveDuplicatesWithAndWithoutPreservingOrder {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("banana");
        list.add("mango");
        list.add("Apple");
        list.add("watermelon");
        list.add("banana");
        list.add("muskmelon");
        list.add("mango");
        list.add("watermelon");

        System.out.println("Original fruit list :");
        System.out.println(list);

        // let's remove the duplicates preserving the order
        Set<String> uniqueSet = new LinkedHashSet<>(list);

        // convert it back to list

        List<String> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println("With order preserved :");
        System.out.println(uniqueList);

        // let's remove the duplicates without preserving the order
        Set<String> uniqueSetNoOrder = new HashSet<>(list);

        // convert it back to list

        List<String> uniqueListNoOrder = new ArrayList<>(uniqueSetNoOrder);

        System.out.println("Without order preserved :");
        System.out.println(uniqueListNoOrder);

    }
}

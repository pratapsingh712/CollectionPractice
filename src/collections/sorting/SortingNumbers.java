package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNumbers {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(4);
        numberList.add(2);
        numberList.add(3);
        numberList.add(1);
        numberList.add(6);
        numberList.add(8);
        numberList.add(7);
        numberList.add(9);
        numberList.add(10);

        System.out.println("ArrayList before sorting :");
        System.out.println(numberList);

        System.out.println("ArrayList After sorting :");
        Collections.sort(numberList);
        System.out.println(numberList);

    }
}

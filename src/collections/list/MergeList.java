package collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeList {
    public static void main(String[] args) {

        // create list one
        List<Integer> listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);

        // create list two
        List<Integer> listTwo = new ArrayList<>();
        listOne.add(5);
        listOne.add(4);
        listOne.add(7);
        listOne.add(8);

        // create list three add all elements from list one and two
        List<Integer> merge = new ArrayList<>();
        merge.addAll(listOne);
        merge.addAll(listTwo);

        System.out.println("Merged list :"+merge);

        // Need to remove any duplicates preset
        Set<Integer> uniqueSet = new HashSet<>(merge);

        // convert it back to list

        List<Integer> unique = new ArrayList<>(uniqueSet);

        System.out.println("Unique merged list :"+unique);

    }
}

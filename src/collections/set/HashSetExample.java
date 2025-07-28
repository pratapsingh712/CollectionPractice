package collections.set;

import  java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        // Create a HashSet object called numbers
        Set<Integer> numberSet = new HashSet<Integer>();
        numberSet.add(1);
        numberSet.add(12);
        numberSet.add(31);
        numberSet.add(15);
        numberSet.add(21);
        numberSet.add(111);
        numberSet.add(4);
        numberSet.add(2);
        numberSet.add(6);

        // print using the iterator
        Iterator<Integer> itr = numberSet.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("************************add couple of more elements******************************");

        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);

        for(Integer obj : numberSet)
        {
            System.out.println(obj);
        }

        System.out.println("************************remove couple of more elements******************************");

        numberSet.remove(2);
        numberSet.remove(21);
        numberSet.remove(222);

        System.out.println(numberSet);
    }
}

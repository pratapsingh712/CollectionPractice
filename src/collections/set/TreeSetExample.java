package collections.set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> numberSet = new TreeSet<>();
        numberSet.add(10);
        numberSet.add(9);
        numberSet.add(8);
        numberSet.add(7);
        numberSet.add(6);
        numberSet.add(5);
        numberSet.add(4);
        numberSet.add(3);
        numberSet.add(2);
        numberSet.add(1);

        System.out.println("Element present in the Tree Set are : \n");
        System.out.println(numberSet+"\n");

        System.out.println("*******************************After adding new elements************************************\n");

        // let's add a couple of number
        numberSet.add(10);
        numberSet.add(9);
        numberSet.add(8);
        numberSet.add(7);
        numberSet.add(6);
        numberSet.add(11);
        numberSet.add(12);
        numberSet.add(13);
        numberSet.add(14);
        numberSet.add(15);

        System.out.println(numberSet+"\n");

        // now let's remove a couple of number
        numberSet.remove(10);
        numberSet.remove(11);
        numberSet.remove(12);
        numberSet.remove(14);

        System.out.println("*******************************After removing few elements************************************\n");

        System.out.println(numberSet+"\n");

    }
}
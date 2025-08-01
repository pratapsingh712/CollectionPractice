package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        // print the original list first :
        System.out.println("original list :");
        System.out.println(list);

        List<Integer> even = list.stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());

        System.out.println("After carefully filter other elements :");
        System.out.println("Event element list is :");
        System.out.println(even);

    }
}

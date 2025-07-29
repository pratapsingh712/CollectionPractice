package collections.hashcode_equals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Point> pointSet = new HashSet<>();
        pointSet.add(new Point(1,2));
        pointSet.add(new Point(3,4));
        pointSet.add(new Point(1,2)); // same coordinates as first

        System.out.println("HashSet size without(hashcode & equals) method : "+pointSet.size());
        System.out.println("HashSet content :"+pointSet);

        // now let's implement the hashcode and equals method then call the method
        // Using Point as a key in HashMap
        Map<Point, String> pointMap = new HashMap<>();
        pointMap.put(new Point(1, 2), "A");
        pointMap.put(new Point(3, 4), "B");
        pointMap.put(new Point(1, 2), "C"); // should overwrite previous value

        System.out.println("HashMap size: " + pointMap.size());
        System.out.println("HashMap contents:");
        for (Map.Entry<Point, String> entry : pointMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

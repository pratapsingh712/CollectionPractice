package collections.map;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<String, Integer> studentList = new TreeMap<>();
        studentList.put("John",21);
        studentList.put("Doe",25);
        studentList.put("Paul",22);
        studentList.put("Emili",19);
        studentList.put("Kumar",24);

        // print the student list using the map object
        System.out.println("Below are the student details :");
        System.out.println(studentList); // student keys are in sorted order

        System.out.println("**********************************************************");

        // print the student details whose name is Kumar
        System.out.println("Name = Kumar "+" age = "+studentList.get("Kumar"));
        System.out.println("**********************************************************");



    }
}

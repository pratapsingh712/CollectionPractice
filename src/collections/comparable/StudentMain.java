package collections.comparable;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John",101));
        studentList.add(new Student("Doe",103));
        studentList.add(new Student("Millie",102));
        studentList.add(new Student("Cyrus",105));
        studentList.add(new Student("Rock",104));

        System.out.println("Student List before sorting it by roll No:");

        Iterator<Student> studentIterator = studentList.iterator();
        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }

        System.out.println("********************************************");
        // sort the list using the name
        System.out.println("---------Sorting based on name-----------");
        Comparator<Student> nameComparator = new StudentNameComparator();
        Collections.sort(studentList,nameComparator);
        studentList.forEach(System.out::println);

        System.out.println("---------Sorting based on rollNo-----------");
        Collections.sort(studentList);
        studentList.forEach(System.out::println);
    }
}

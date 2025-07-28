package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> studentList = new HashMap<>();
        studentList.put("John",21);
        studentList.put("Doe",25);
        studentList.put("Paul",22);
        studentList.put("Emili",19);
        studentList.put("Kumar",24);

        // Print the original map using the map object
        System.out.println("Student List is printed below :\n");
        System.out.println(studentList);

        // print using Entry Set
        for(Map.Entry<String, Integer> entry : studentList.entrySet()){
            System.out.println("Name "+entry.getKey()+" and Age : "+entry.getValue());
        }

        System.out.println("****************************************************************");
        // let's get the age of a specific student for an example john

        Integer johnAge = studentList.get("John");
        System.out.println("John age = "+johnAge);

        System.out.println("****************************************************************");
        // remove a student called paul

        studentList.remove("Paul");

        for(Map.Entry<String, Integer> entry : studentList.entrySet()){
            System.out.println("Name "+entry.getKey()+" age = "+entry.getValue());
        }

        System.out.println("****************************************************************");
        // check if paul exist return empty if not

        if(studentList.get("Emili")!=null){
            Integer age = studentList.get("Emili");
            System.out.println("Name = "+"Emili, "+" age = "+age);
        }else{
            System.out.println("Empty");
        }

        System.out.println("****************************************************************");
        // check if a particular age = 24 exist

        for(Map.Entry<String, Integer> obj : studentList.entrySet()){
            if(obj.getValue()==24){
                String name = obj.getKey();
                System.out.println("Name = "+name+" and age = "+24);
            }
        }

        System.out.println("****************************************************************");
        // update the age of an existing student = Kumar

        studentList.put("Kumar",25); // basically over-riding the value with a new value

        studentList.replace("Doe",26); // using the replace method

        studentList.computeIfPresent("John",(key, oldvalue) -> oldvalue+1); // by using the compute if present method

        System.out.println("Updated details of the students are : ");
        System.out.println(studentList);

        System.out.println("****************************************************************");

        // removing the doe details
        studentList.remove("Doe");
        System.out.println(studentList);

        System.out.println("****************************************************************");

        // checking if name is present

        if(studentList.containsKey("Doe")){
            System.out.println("Name = Doe"+" age = "+studentList.get("Doe"));
        }else{
            System.out.println("Student Not present!");
        }

        System.out.println("****************************************************************");

        // checking if age is present
        for(Map.Entry<String, Integer> entry : studentList.entrySet()){
            if(entry.getValue()==22){
                System.out.println("Name = "+entry.getKey()+" age = "+entry.getValue());
            }
        }

        System.out.println("***************************************************************");

        for(Map.Entry<String, Integer> studentDetails : studentList.entrySet()){
            System.out.println("Name :"+studentDetails.getKey()+" age = "+studentDetails.getValue());
        }
    }
}

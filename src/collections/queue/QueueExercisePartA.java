package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercisePartA {

    public static void main(String[] args) {

        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.offer("Task 1 : prepare presentation :");
        taskQueue.offer("Task 2 : send email updates :");
        taskQueue.offer("Task 3 : Review code changes :");
        taskQueue.offer("Task 4 : Schedule meeting with client :");
        taskQueue.offer("Task 5 : write project report :");

        System.out.println("Initial Queue :" +taskQueue);
        System.out.println("Queue size :"+taskQueue.size());


        //print the element at the head of the queue without removing it peek()
        String headTask = taskQueue.peek();
        System.out.println("\nTask at the head (peak): "+headTask);
        System.out.println("Queue after peek(unchanged) :"+taskQueue);

        // remove and print the list elements one by one until it's empty
        System.out.println("\n------processing Tasks------");

        while(!taskQueue.isEmpty()){
            String processedTask = taskQueue.poll();
            System.out.println("Processing: "+processedTask);
            System.out.println("Current Queue :"+taskQueue); // shows list of list after each removal
            System.out.println("Queue size: "+taskQueue.size());
        }

        System.out.println("\nAll tasks processed. Queue is empty :"+taskQueue.isEmpty());

    }
}

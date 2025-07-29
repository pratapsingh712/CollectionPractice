package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExercisePartB {

    public static void main(String[] args) {

        // create a priorityQueue of Integers

        Queue<Integer> numberPriorityQueue = new PriorityQueue<>();
        // Add several numbers
        numberPriorityQueue.offer(50);
        numberPriorityQueue.offer(10);
        numberPriorityQueue.offer(70);
        numberPriorityQueue.offer(30);
        numberPriorityQueue.offer(20);
        numberPriorityQueue.offer(90);

        System.out.println("Initial PriorityQueue "+numberPriorityQueue);

        // poll the elements one by one and observe they are retrieved in their natural sorted order

        while(!numberPriorityQueue.isEmpty()){
            Integer polledNumber = numberPriorityQueue.poll();
            System.out.println("Polled :"+polledNumber);
            System.out.println("Queue after poll :"+numberPriorityQueue);
        }

        System.out.println("PriorityQueue is Empty now :");

        // Add new numbers & duplicates
        numberPriorityQueue = new PriorityQueue<>();

        numberPriorityQueue.offer(15);
        numberPriorityQueue.offer(5);
        numberPriorityQueue.offer(20);
        numberPriorityQueue.offer(5);
        numberPriorityQueue.offer(15);
        numberPriorityQueue.offer(10);

        System.out.println("PriorityQueue with duplicate elements : ");
        System.out.println("\n--- Polling elements from priorityQueue with duplicates ---");

        while(!numberPriorityQueue.isEmpty()){
            Integer polledNumber = numberPriorityQueue.poll();
            System.out.println("Polled: "+polledNumber);
            System.out.println("Queue after poll :"+numberPriorityQueue);
        }

        System.out.println("PriorityQueue is now empty: "+numberPriorityQueue.isEmpty());

    }
}

package com.collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This is a class to show the demo of the "queue" data structure of the collection framework
 *
 * Queue works on the FIFO principle that is "First In First Out"
 *
 * that when we use queue.remove() method the first element that was added to queue will be removed.
 *
 * few of the main methods of queue class as shown in this class.
 */
public class QueueDemo {

    public static void main(String[] args) {

        // Create a new Integer Queue.
        Queue<Integer> queue = new LinkedList<>();

        // Populate the queue
        for (int i = 0; i <= 5; i++) {
            queue.add(i);
        }

        System.out.println(queue);
        System.out.println("================");
        //queue.remove() removes the first element from the queue, it throws an NullPointerException if the queue is empty
        System.out.println(queue.remove());
        System.out.println(queue);
        //queue.peek is to show the first element in the queue.
        System.out.println(queue.peek());
        System.out.println("================");
        System.out.println(queue);
        System.out.println("================");
        //queue.poll() removes the first element from the queue,
        //Unlike remove() method it will return "null" if the queue is empty
        System.out.println(queue.poll());
        System.out.println("================");
        System.out.println(queue);
    }
}

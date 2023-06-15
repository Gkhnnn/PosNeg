package Que;

import java.util.PriorityQueue;

public class PiortyQue {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(34);
        priorityQueue.add(12);
        priorityQueue.add(90);
        priorityQueue.add(1);
        priorityQueue.add(68);
        priorityQueue.add(8);
        priorityQueue.add(78);

        System.out.println("priorityQueue.peek() = " + priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        priorityQueue.poll();
        System.out.println(priorityQueue.peek());
        priorityQueue.poll();
        System.out.println(priorityQueue.peek());

        priorityQueue.poll();
        System.out.println(priorityQueue);


        PriorityQueue priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add("Aaba");
        priorityQueue1.add("Zab");
        priorityQueue1.add("Abcd");
        priorityQueue1.add("Baa");
        priorityQueue1.add("Aaaa");
        System.out.println(priorityQueue1);

    }
}

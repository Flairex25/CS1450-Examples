package FlairList.FlairPriorityQueue;

import FlairList.FlairList;

public class PriorityQueueTest {
    public static void main(String[] args) {
        //Test priority queue
        FlairPriorityQueue<Integer> myPriorityQueue = new FlairPriorityQueue<>();

        myPriorityQueue.setOrder((Integer a, Integer b) -> {
            return a > b;
        });

        myPriorityQueue.offer(10);
        myPriorityQueue.offer(4);
        myPriorityQueue.offer(6);
        myPriorityQueue.offer(1);
        myPriorityQueue.offer(3);
        myPriorityQueue.offer(2);
        myPriorityQueue.offer(7);
        myPriorityQueue.offer(9);
        myPriorityQueue.offer(5);
        myPriorityQueue.offer(8);

        printArray(myPriorityQueue, "myPriorityQueue");
    }   

    public static <T> void printArray(FlairList<T> list, String listName) {
        System.out.println("----------------------");
        list.forEach((int i, T v) -> {
            System.out.println(listName+"["+i+"] = "+v);
        });
    }
}

package FlairList.FlairQueue;

public class FlairQueueTest {
    public static void main(String[] arg) {
        //Create queue
        FlairQueue<Integer> myQueue = new FlairQueue<>();

        //Add values
        myQueue.offer(1);
        myQueue.offer(5);
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(2);

        //Remove all
        for (int i = 0; !myQueue.isEmpty(); i++) {
            System.out.println("myQueue[" + i + "] = " + myQueue.poll());
            //The 'L' stands for Larp btw
        }
    }
}

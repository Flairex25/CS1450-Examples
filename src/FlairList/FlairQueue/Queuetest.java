package FlairList.FlairQueue;

public class Queuetest {
    public static void main(String[] args) {
        //Test queue
        FlairQueue<String> myQueue = new FlairQueue<>();

        myQueue.offer("0x01FFE2A1");
        myQueue.offer("0x0110FEA2");
        myQueue.offer("0x001BBFE5");
        myQueue.offer("0x014AB8E9");
        myQueue.offer("0x017EE5AB");

        while (!myQueue.isEmpty()) {
            System.out.println("Thread "+myQueue.poll()+" finished");
        }
    }
}

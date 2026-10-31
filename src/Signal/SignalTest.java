package Signal;

public class SignalTest {
    public static void main(String[] args) {
        //Test
        Signal<String> event = new Signal<>();

        Connection<String> connection1 = event.connect((String msg) -> {
            System.out.println("Thread 1 message received: "+msg);
        });
        Connection<String> connection2 = event.once((String msg) -> {
            System.out.println("Thread 2 message received: "+msg);
        });

        event.fire("Hello!");
        event.fire("Hi!");

        connection1.disconnect();
        connection2.disconnect();
    }
}

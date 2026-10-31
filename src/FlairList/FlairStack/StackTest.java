package FlairList.FlairStack;

public class StackTest {
    public static void main(String[] args) {
        //Test stack
        FlairStack<String> myStack = new FlairStack<>();

        myStack.push("Main");
        myStack.push("Function 1");
        myStack.push("Function 2");
        myStack.push("Function 3");

        while (!myStack.isEmpty()) {
            System.out.println("Exiting: "+myStack.pop());
        }
    }   
}
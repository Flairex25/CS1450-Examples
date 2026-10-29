package FlairList.FlairStack;

public class FlairStackTest {
    public static void main(String[] args) {
        //Create new stack
        FlairStack<Integer> myStack = new FlairStack<>();

        //Push values
        myStack.push(5);
        myStack.push(3);
        myStack.push(10);
        myStack.pop();
        myStack.push(4);
        myStack.push(1);
        myStack.push(2);

        //Print current value
        System.out.println("Current value on the top of stack is: "+myStack.peek());
        //Print stack
        printArr(myStack);
    }

    public static <T> void printArr(FlairStack<T> stack) {
        stack.forEach((int i, T v) -> {
            System.out.println("Stack["+i+"] = "+v);
        });
    }
}

package FlairList.FlairStack;

import FlairList.FlairList;

public class FlairStack<T> extends FlairList<T> {

    public void push(T value) {
        add(value);
    }

    public T pop() {
        return remove(size-1);
    }

    public T peek() {
        return get(size-1);
    }
}
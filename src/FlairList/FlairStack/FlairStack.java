package FlairList.FlairStack;

import java.util.ArrayList;

import FlairList.FlairList;

class FlairStack<T> extends FlairList<T> {
    //private
    private ArrayList<T> data = new ArrayList<>();
    //push
    public void push(T value) {
        data.addLast(value);
        size++;
    }
    //pop
    public T pop() {
        if (isEmpty()) {
            return data.get(0);
        }
        T result = data.get(size-1);
        data.remove(size-1);
        size--;
        return result;
    }
    //peek
    public T peek() {
        if (isEmpty()) {
            return data.get(0);
        }
        return data.get(size-1);
    }
}
package FlairList.FlairQueue;

import java.util.ArrayList;

import FlairList.FlairList;

public class FlairQueue<T> extends FlairList<T> {
    //private
    private ArrayList<T> data = new ArrayList<>();
    //offer
    public void offer(T value) {
        data.addLast(value);
        size++;
    }
    //peek
    public T peek() {
        return data.get(0);
    }
    //poll
    public T poll() {
        T result = data.remove(0);
        size--;
        return result;
    }
}
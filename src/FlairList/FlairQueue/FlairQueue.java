package FlairList.FlairQueue;

import FlairList.FlairList;

public class FlairQueue<T> extends FlairList<T> {
    
    public void offer(T value) {
        add(value);
    }

    public T poll() {
        return remove(0);
    }

    public T peek() {
        return get(0);
    }
    
}
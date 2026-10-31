package FlairList.FlairPriorityQueue;

import FlairList.FlairQueue.FlairQueue;

public class FlairPriorityQueue<T> extends FlairQueue<T> {
    
    private FLIterableCompare<T> queueOrder = (T a, T b) -> {
        return false;
    };

    public void setOrder(FLIterableCompare<T> compareFunc) {
        queueOrder = compareFunc;
        //sort(compareFunc);
    }

    public void offer(T value) {
        for (int i = 0; i < size; i++) {
            if (queueOrder.callback(value, get(i))) {
                add(i, value);
                return;
            }
        }
        add(value);
    }
}

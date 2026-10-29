package FlairList;

import java.util.ArrayList;

public class FlairList<T> {
    //Functional Interfaces
    @FunctionalInterface 
    public interface ListLoop<T> {
        public void loopCallback(int i, T v);
    }
    @FunctionalInterface 
    public interface ListSort<T> {
        public boolean listSort(T a, T b);
    }
    //Private members
    protected int size;
    protected ArrayList<T> data = new ArrayList<>();
    //Methods
    public int getSize() { return size; }
    public boolean isEmpty() { return (size == 0); }
    public void forEach(ListLoop<T> callback) {
        for (int i = 0; i < size; i++) {
            callback.loopCallback(i, data.get(i));
        }
    }
    protected void swap(int indexA, int indexB) {
        T a = data.get(indexA);
        T b = data.get(indexB);
        data.set(indexA, b);
        data.set(indexB, a);
    }
    public void sort(ListSort<T> callback) {
        for (int i = 0; i < data.size(); i++) {
            for (int v = 0; v < data.size()-1; v++) {
                if (callback.listSort(data.get(v), data.get(v+1))) {
                    swap(v, v+1);
                }
            }
        }
    }
}
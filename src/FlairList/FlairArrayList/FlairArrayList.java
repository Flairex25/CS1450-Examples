package FlairList.FlairArrayList;

import FlairList.*;

public class FlairArrayList<T> extends FlairList<T> {
    //Methods
    //get
    public T get(int index) {
        return data.get(index);
    }
    //set
    public void set(int index, T value) {
        data.set(index, value);
    }
    //add
    public void add(int index, T value) {
        data.add(index, value);
        size++;
    }
    public void add(T value) {
        data.add(value);
        size++;
    }
    //addFirst
    public void addFirst(T value) {
        data.addFirst(value);
        size++;
    }
    //addLast
    public void addLast(T value) {
        data.addLast(value);
        size++;
    }
    //remove
    public T remove(int index) {
        T result = data.remove(index);
        size--;
        return result;
    }
    public T removeFirst() {
        return this.remove(0);
    }
    public T removeLast() {
        return this.remove(size);
    }
}
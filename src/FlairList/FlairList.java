package FlairList;

public abstract class FlairList<T> implements FLIterable<T> {
    //Private fields
    protected T[] data;
    protected int size;

    public int getSize() { return size; }
    public boolean isEmpty() { return size == 0; }

    protected void outOfBoundsException(int index) {
        throw new IllegalArgumentException("FlairListException: index " + index + " is out of bounds!");
    }

    public void add(int index, T value) {
        if (index > size || index < 0) {
            //Out of bounds
            outOfBoundsException(index);
        }
        //Create new array
        size++;
        T[] oldData = data;
        @SuppressWarnings("unchecked")
        T[] newData = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            if (i < index) {
                newData[i] = oldData[i];
            }
            else if (i > index) {
                newData[i] = oldData[i - 1];
            }
        }
        newData[index] = value;
        data = newData;
    }
    public void add(T value) {
        add(size, value);
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            outOfBoundsException(index);
        }
        return data[index];
    }
    
    public T remove(int index) {
        if (index < 0 || index >= size) {
            outOfBoundsException(index);
        }
        T value = data[index];
        //Move items to new array
        size--;
        T[] oldData = data;
        @SuppressWarnings("unchecked")
        T[] newData = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            if (i < index) {
                newData[i] = oldData[i];
            }
            else {
                newData[i] = oldData[i+1];
            }
        }
        this.data = newData;
        return value;
    }

    public void clear() {
        size = 0;
        @SuppressWarnings("unchecked")
        T[] newData = (T[]) new Object[size];
        data = newData;
    }

    public void forEach(FLIterableForEach<T> forEachFunc) {
        for (int i = 0; i < size; i++) {
            forEachFunc.callback(i, data[i]);
        }
    }

    protected void swap(int indexA, int indexB) {
        T temp = data[indexA];
        data[indexA] = data[indexB];
        data[indexB] = temp;
    }

    public void sort(FLIterableCompare<T> compareFunc) {
        //Simple bubble sort
        for (int i = 0; i < size; i++) {
            for (int v = 0; v < size-1; v++) {
                if (compareFunc.callback(data[v], data[v+1])) {
                    swap(v, v+1);
                }
            }
        }
    }
}

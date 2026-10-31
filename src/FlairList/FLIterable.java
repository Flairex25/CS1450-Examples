package FlairList;

public abstract interface FLIterable<T> {
    //Functional
    @FunctionalInterface 
    abstract interface FLIterableCompare<T> {
        boolean callback(T a, T b);
    }
    @FunctionalInterface 
    abstract interface FLIterableForEach<T> {
        void callback(int i, T v);
    }

    //Size
    int getSize();
    boolean isEmpty();
    //Add
    void add(T value);
    void add(int index, T value);
    //Get
    T get(int index);
    //Remove
    T remove(int index);
    //Clear
    void clear();
    //ForEach
    void forEach(FLIterableForEach<T> forEachFunc);
    //Sort
    void sort(FLIterableCompare<T> compareFunc);
}
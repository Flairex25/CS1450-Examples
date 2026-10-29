package FlairList.FlairArrayList;

import Log.*;

public class FlairArrayListTest {
    public static void main(String[] args) {
        //Create new array list of Integers
        FlairArrayList<Integer> myList = new FlairArrayList<>();

        myList.add(1);
        myList.add(1, 2);
        myList.addFirst(6);
        myList.addLast(7);
        myList.addLast(15);
        myList.addLast(20);
        myList.set(3,5);
        myList.addLast(21);
        myList.addLast(0);

        myList.remove(0);

        //Print array
        Log.println("Before sorting: ");
        printList(myList);

        //Sort array
        myList.sort((Integer a, Integer b) -> {
            return a.intValue() < b.intValue();
        });

        //Print array
        Log.println("After sorting: ");
        printList(myList);
    }

    public static <T> void printList(FlairArrayList<T> list) {
        list.forEach((int i, T v) -> {
            System.out.println("myList["+i+"] = "+v);
        });
    }
}

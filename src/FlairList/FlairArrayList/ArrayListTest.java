package FlairList.FlairArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //Create new array list
        FlairArrayList<Integer> myArrayList = new FlairArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(4);
        
        printArray(myArrayList);

        myArrayList.add(2, 3);

        printArray(myArrayList);

        myArrayList.remove(1);

        printArray(myArrayList);

        myArrayList.clear();
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(1);
        myArrayList.add(4);

        printArray(myArrayList);
        System.out.println("^ Before Sorting ^");

        myArrayList.sort((Integer a, Integer b) -> {
            return a > b;
        });
        printArray(myArrayList);
        System.out.println("^ After Sorting ^");
    }

    public static <T> void printArray(FlairArrayList<T> arrayList) {
        System.out.println("------------------------");
        arrayList.forEach((int i, T v) -> {
            System.out.println("myArrayList["+i+"] = "+v);
        });
    }
}
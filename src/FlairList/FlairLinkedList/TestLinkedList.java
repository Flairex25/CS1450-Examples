package FlairList.FlairLinkedList;

import GeometricObject.*;
import GeometricObject.Circle.Circle;
import GeometricObject.Rectangle.Rectangle;

public class TestLinkedList {
    public static void main(String[] args) {
        //Test Linked List
        FlairLinkedList<GeometricObject> myList = new FlairLinkedList<>();

        myList.add(new Circle(1));
        myList.add(new Rectangle(1,2));
        myList.add(new Circle(5));
        myList.add(new Rectangle(4,3));
        myList.add(new Circle());
        myList.add(new Rectangle());

        myList.remove(2);
        
        myList.forEach((int i, GeometricObject object) -> {
            System.out.println("The area of GeometricObject "+(i+1)+" is "+object.getArea());
        });
    }
}

class Signal<T> {
    FlairLinkedList<Connection<T>> list;
}

class Connection<T> {
    Signal<T> signal;

}
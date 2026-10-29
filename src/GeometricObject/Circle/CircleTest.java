package GeometricObject.Circle;
import  GeometricObject.*;

public class CircleTest {
    public static void main(String[] args) {
        //Create circle 1 of type GeometrictObject,
        //Create circle 2 of type Circle
        GeometricObject circle1 = new Circle(1);
        Circle circle2 = new Circle(4);

        //Both areas are accessible from the BaseClass method getArea()
        System.out.println("Circle 1 area: " + circle1.getArea());
        System.out.println("Circle 2 area: " + circle2.getArea());
        //Only the radius of circle2 is accessible since it is defined
        //as a type of Circle
        System.out.println("Circle 1 radius: inaccessible!");
        System.out.println("Circle 2 radius: " + circle2.getRadius());
    }
}
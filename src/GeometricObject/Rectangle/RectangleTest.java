package GeometricObject.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        //Create 2 Rectangles
        Rectangle myRectangle1 = new Rectangle();
        Rectangle myRectangle2 = new Rectangle(10, 5);

        //Modify myRectangle1
        myRectangle1.setWidth(12);
        myRectangle1.setHeight(15);

        //Print both rectangles
        printRectangle("myRectangle1", myRectangle1);
        printRectangle("myRectangle2", myRectangle2);
    }   

    static void printRectangle(String rectangleName, Rectangle rectangle) {
        System.out.printf("%s: { Width: %.2f, Height %.2f, Area: %f }\n",
        rectangleName,
        rectangle.getWidth(),
        rectangle.getHeight(),
        rectangle.getArea());
    }
}
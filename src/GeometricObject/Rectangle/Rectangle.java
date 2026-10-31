package GeometricObject.Rectangle;

import GeometricObject.*;

public class Rectangle extends GeometricObject {



    //private fields
    private double width;
    private double height;



    //Constructors
    public Rectangle() {}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    //Getters
    public double getWidth() { return width; }
    public double getHeight() { return height; }




    //Setters
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }



    //calculateArea
    @Override 
    public void calculateArea() {
        area = width * height;
    }
}

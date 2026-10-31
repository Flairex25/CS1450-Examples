package GeometricObject.Circle;

import FlairMath.*;
import GeometricObject.*;

public class Circle extends GeometricObject {



    //Private fields
    private double radius;



    //Constructor
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }


    
    //Override calculateArea
    @Override 
    public void calculateArea() {
        this.area = FlairMath.PI * FlairMath.square(radius);
    }

    //Getters
    public double getRadius() {
        return radius;
    }
    //Setters
    public void setRadius(double radius) {
        this.radius = radius;
        this.calculateArea();
    }
}
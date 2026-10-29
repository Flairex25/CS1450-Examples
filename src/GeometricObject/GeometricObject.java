package GeometricObject;

public class GeometricObject {
    //Private fields
    protected  double area;
    //Constructor
    protected  GeometricObject() {
        area = 0.0;
    }
    //Getters
    public double getArea() {
        calculateArea();
        return area;
    }
    //Public methods
    public void calculateArea() {
        
    }
}
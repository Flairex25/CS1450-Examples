package FLVectors;

import FlairMath.*;

public class Vector2 extends BaseVector {



    //Private fields
    protected double x;
    protected double y;



    //Constructors
    public Vector2() {
        //In Java, all primitive fields of a class are automatically
        //initialized to 0, so in this case 'x' and 'y' will be
        //initialized to 0.
    }



    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }



    //Getters
    public double getX() { return x; }
    public double getY() { return y; }



    //Setters
    public void setY(double y) { this.y = y; }
    public void setX(double x) { this.x = x; }



    //Distance formula for Vector2 class
    //Generic distance formula for 4 specified values
    public static double distance(double x1, double y1, double x2, double y2) {
        return FlairMath.sqrt(FlairMath.square(x1 - x2) + FlairMath.square(y1 - y2));
    }

    //Distance formula for 2 specified Vector2 objects
    //Overrides the method distance(x1, y1, x2, y2)
    public static double distance(Vector2 a, Vector2 b) {
        return distance(a.x, a.y, b.x, b.y);
    }



    //Distance formulas for instances of Vector2
    public double distance(Vector2 vector) {
        return  distance(this, vector);
    }

    public double distance(double x, double y) {
        return distance(this.x, this.y, x, y);
    }



    //Unit formula for Vector2 class
    public static Vector2 unit(double x, double y) {
        double magnitude = distance(x, y, 0, 0);
        if (magnitude == 0) {
            //Division by zero, return empty vector
            return new Vector2();
        }
        else {
            return new Vector2(x/magnitude, y/magnitude);
        }
    }

    public static Vector2 unit(Vector2 vector) {
        return unit(vector.x, vector.y);
    }



    //Unit formula for instances of Vector2
    public Vector2 unit() {
        return unit(this);
    }
}

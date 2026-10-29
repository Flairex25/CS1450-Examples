package FLVectors;

import FlairMath.FlairMath;

public class Vector3 extends Vector2 {
    


    //Private fields
    //Only 1 additional field 'z' since
    //'x' and 'y' are already defined in Vector2
    private double z;



    //Constructors
    public Vector3() {}



    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }



    //Getters
    //public double getX() { return x; }
    //public double getY() { return y; }
    //These methods are already defined in Vector2
    public double getZ() { return z; }



    //Setters
    //public void setX(double x) { this.x = x; }
    //public void setY(double y) { this.y = y; }
    //These methods are already defined in Vector2
    public void setZ(double z) { this.z = z; }



    //Distance formula for Vector3 class
    public static double distance(
        double x1,
        double y1,
        double z1,
        double x2,
        double y2,
        double z2
    )
    {
        return FlairMath.sqrt(
            FlairMath.square(x1 - x2) +
            FlairMath.square(y1 - y2) + 
            FlairMath.square(z1 - z1)
        );
    }

    //Distance formula for 2 specified Vector3 objects
    //Overrides the method distance(x1, y1, z1, x2, y2, z2)
    public static double distance(Vector3 a, Vector3 b) {
        return distance(a.x, a.y, a.z, b.x, b.y, b.z);
    }



    //Distance formulas for instances of Vector3
    public double distance(Vector3 vector) {
        return  distance(this, vector);
    }

    public double distance(double x, double y, double z) {
        return distance(this.x, this.y, this.z, x, y, z);
    }



    //Unit formula for Vector3 class
    public static Vector3 unit(double x, double y, double z) {
        double magnitude = distance(x, y, z, 0, 0, 0);
        if (magnitude == 0) {
            //Division by zero, return empty vector
            return new Vector3();
        }
        else {
            return new Vector3(x/magnitude, y/magnitude, z/magnitude);
        }
    }

    public static Vector3 unit(Vector3 vector) {
        return unit(vector.x, vector.y, vector.z);
    }



    //Unit formula for instances of Vector3
    public Vector3 unit() {
        return unit(this.x, this.y, this.z);
    }
}

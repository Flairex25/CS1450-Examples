package FLVectors;

import FlairMath.FlairMath;

public class VectorTest {
    public static void main(String[] args) {
        //Testing 2D Vectors
        //Create 2 instances of Vector2
        Vector2 myVector2A = new Vector2();
        Vector2 myVector2B = new Vector2(4.2, 6.9);

        //Find the distance between vectors
        double dist2D;

        //This can be done in 4 ways
        dist2D = Vector2.distance(myVector2A.getX(), 
            myVector2A.getY(), 
            myVector2B.getX(), 
            myVector2B.getY());

        dist2D = Vector2.distance(myVector2A, myVector2B);

        dist2D = myVector2A.distance(myVector2B);

        dist2D = myVector2B.distance(myVector2A.getX(), myVector2A.getY());

        System.out.println("The distance between myVector2A and myVector2B is: "
            + dist2D + " units.");

        //Finding unit of Vector2
        Vector2 myVector2C = new Vector2(10, 5);
        Vector2 unitVector2 = myVector2C.unit();

        System.out.printf("Unit of vector (%.2f, %.2f)\n",
            myVector2C.getX(),
            myVector2C.getY());
        System.out.printf("X: %f\nY: %f\n",
            unitVector2.getX(),
            unitVector2.getY());

        
        //Testing 3D vectors
        //Create 2 Vector3 objects
        //toVector3 is a static method written in the BaseVector
        //class to allow for convertions between Vector2 and Vector3
        Vector3 myVector3A = new Vector3();
        Vector3 myVector3B = BaseVector.toVector3(new Vector2(1, 2));

        //Find distance between vectors
        //Similarly, this can be done in 1 of 4 ways
        double dist3D;

        dist3D = Vector3.distance(
            myVector3A.getX(),
            myVector3A.getY(),
            myVector3A.getZ(),
            myVector3B.getX(),
            myVector3B.getY(),
            myVector3B.getZ());
        
        dist3D = Vector3.distance(myVector3A, myVector3B);

        dist3D = myVector3A.distance(myVector3B);

        dist3D = myVector3A.distance(
            myVector3B.getX(),
            myVector3B.getY(),
            myVector3B.getZ());

        System.out.println("The distance between myVector3A and myVector3B is: "
            + dist3D
        );

        //Find unit of Vector3 object
        Vector3 myVector3C = new Vector3(2.8, 4.7, FlairMath.PI/2);
        Vector3 unitVector3 = myVector3C.unit();

        System.out.printf("Unit of vector (%.2f, %.2f, %.2f)\n",
            myVector3C.getX(),
            myVector3C.getY(),
            myVector3C.getZ());
        System.out.printf("X: %f\nY: %f\nZ: %f\n",
            unitVector3.getX(),
            unitVector3.getY(),
            unitVector3.getZ());
    }
}
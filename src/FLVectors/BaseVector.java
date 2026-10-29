package FLVectors;

public class BaseVector {



    //Constructor
    //protected is used to make this member private outside the class as
    //a whole but accessible to subclasses
    protected BaseVector() {}



    //BaseClass methods
    public static Vector2 toVector2(Vector3 vector) {
        return new Vector2(vector.getX(), vector.getY());
    }
    public static Vector3 toVector3(Vector2 vector) {
        return new Vector3(vector.getX(), vector.getY(), 0);
    }



    //Object Methods
    protected BaseVector distance(BaseVector vector) {
        return new BaseVector();
    }
    protected BaseVector unit() {
        return new BaseVector();
    }
}
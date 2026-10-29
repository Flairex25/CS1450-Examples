package FlairMath;

public class FlairMath {
    //Private constructor
    private FlairMath() {
        //Since we don't want this class to be instantiated,
        //Making this constructor private will enable this for us
    }
    //Constants
    //Using the keyword final, we can define values we
    //do not want the user to modify during runtime
    public static final double PI = 3.14159265;
    //Methods
    //The keyword static allows us to define members of a class
    //that belong to the class only and exist outside of objects.
    //If an object modifies a static member, that member is a part
    //of the entire class, so each object sees those changes.
    public static double square(double x) { return x * x; }
    public static int square(int x) { return x * x; }
    public static double sqrt(double x) { return Math.sqrt(x); }
}
package FlairString;

public class FlairString {
    //toString
    public static String toString(double x) {
        return String.valueOf(x);
    }
    //combineString
    public static String combineString(String[] strings) {
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            result += strings[i];
        }
        return result;
    }
}
package Log;

import java.util.logging.Logger;

import FlairString.FlairString;

public class Log {
    //private members
    private static Logger logger = Logger.getLogger(Log.class.getName());
    //print
    public static void print(String msg) {
        System.out.print(msg);
    }
    public static void print(String[] msg) {
        System.out.print(msg);
    }
    public static void print(double msg) {
        System.out.print(msg);
    }
    //println
    public static void println(String msg) {
        System.out.println(msg);
    }
    public static void println(String[] msg) {
        System.out.println(msg);
    }
    public static void println(double msg) {
        System.out.println(msg);
    }
    //endl
    public static void endl() {
        System.out.println();
    }
    //warn
    public static void warn(String msg) {
        logger.warning(msg);
    }
    public static void warn(String[] msg) {
        logger.warning(FlairString.combineString(msg));
    }
}

package za.ac.cput.util;

public class Helper {
    public static boolean isNull(int s){
        if(s == 0)
            return true;
        return false;
    }

    public static boolean isNullorEmpty(String x){
        if(x.isEmpty() || x == null)
            return true;
        return false;
    }
}

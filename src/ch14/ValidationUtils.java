package ch14;

public class ValidationUtils {

    private ValidationUtils() {

    }

    public static boolean isOneTo31(String s) {
        return !s.isEmpty() && s.length() <= 31;
    }

    public static boolean isBetween1and10(int n) {
        return n >=1 && n <=10;
    }
}

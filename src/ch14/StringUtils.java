package ch14;

public class StringUtils {

    private StringUtils() {
    }

    /**
     * Reverses a string
     * @param s the string to be reversed
     * @return
     */
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Converses a string to uppercase
     * @param s
     * @return
     */
    public static String upperString(String s) {
        return s.toUpperCase();
    }

    /**
     * Checks if a string can be read both ways
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}

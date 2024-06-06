package ch14;

public class MathHelper {

    private MathHelper() {

    }

    /**
     * Finds the min value of an array.
     * @param arr
     * @return
     */
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Finds the max value of an array.
     * @param arr
     * @return
     */
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Finds the average value of an array.
     * @param arr
     * @return
     */
    public static double findAverage(int[] arr) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        return (double) sum /count;
    }
}

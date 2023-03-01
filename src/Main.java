import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double max = findMax(arr);
        double min = findMin(arr);
        double sum = findSum(arr);
        double average = findAverage(arr);
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(average);
    }
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static double findMin(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static double findSum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static double findAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static double findMedian(double[] arr) {
        Arrays.sort(arr);
        double median = 0;
        if (arr.length % 2 == 0) {
            int indexFirst = ((arr.length / 2) -1);
            int indexSecond = (indexFirst + 1);
            median = (arr[indexFirst]+arr[indexSecond] / 2);
            median /= 2;

        }
        return median;
    }
}

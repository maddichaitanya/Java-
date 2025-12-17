//import java.util.*;

public class SumofSubArray {
    public static void subarray(int number[]) {

    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
    for (int i = 0; i < number.length; i++) {
    int start = i;

    for (int j = i; j < number.length; j++) {
    int end = j;
    currsum = 0;
    for (int k = start; k <= end; k++) {
    // sub array sum
    currsum += number[k];

    }
    System.out.println(currsum);
    if (maxsum < currsum) {
    maxsum = currsum;
    }

    }

    }
    System.out.println("max sum of subarrays are = " + maxsum);
    }

    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 4, 5 };
        subarray(number);
    }

}

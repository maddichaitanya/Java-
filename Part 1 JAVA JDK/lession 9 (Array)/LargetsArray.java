//import java.util.*;

public class LargetsArray {

    public static int largest(int num[]) {
        int largest = Integer.MIN_VALUE; // -INFINITY
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {

            // for largest
            if (largest < num[i]) {
                largest = num[i];
            }
            // for smallest
            if (smallest > num[i]) {
                smallest = num[i];
            }

        }
        System.out.println("smallest value is : " + smallest);
        return largest;

    }

    public static void main(String[] args) {
        int num[] = { 12, 33, 21, 321, 890 };
        int largest = largest(num);

        System.out.println("largest number is : " + largest);

    }

}

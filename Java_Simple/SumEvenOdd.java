import java.util.*;
class SumEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sumeven = 0;
        int sumodd = 0;
        int num;
        System.out.print("Enter numbers (enter 0 to stop):");
        // loop continues until user enters 0
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break; // stop the loop
            }
            if (num % 2 == 0) {
                sumeven += num;
            } else {
                sumodd += num;
            }
        }
        System.out.println("Sum of even numbers: " + sumeven);
        System.out.println("Sum of odd numbers: " + sumodd);
        sc.close();
    }
}

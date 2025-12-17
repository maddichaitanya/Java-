import java.util.Scanner;

/**
 * Prime
 */
public class Prime {

    public static void main(String[] args) {
        // int i = 0;
        // while (i < 11) {
        // System.out.println(i);
        // i++;

        // }
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // while (i < n) {

        // System.out.println(i);
        // i++;

        // }

        // prime number which is divisible by number 1 AND its numbers

        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println(n + "  is prime number ");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) { // n is divisibke by many number
                    isprime = false;
                }

            }

            if (isprime == true) {
                System.out.println(n + " is prime number ");

            } else {
                System.out.println(n + " is not prime number ");
            }
        }

    }
}
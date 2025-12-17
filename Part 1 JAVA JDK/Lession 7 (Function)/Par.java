import java.util.Scanner;

public class Par {

    public static int print(int a, int b) {
        int sum = a + b;
        return sum;
        // System.out.println("hello :" + fname);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = print(a, b); // function call
        System.out.println("sum of a and b: " + sum);

    }
}

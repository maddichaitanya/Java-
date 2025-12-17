import java.util.Scanner;

public class SumIpu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number a");
        int a = sc.nextInt();
        System.out.println("Enter First number b");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two input number a & b are: " + sum);
    }

}

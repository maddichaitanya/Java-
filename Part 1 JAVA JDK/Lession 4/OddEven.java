import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Enter number is Even :" + a);
        } else {
            System.out.println("Enter number is Odd :" + a);
        }
    }

}

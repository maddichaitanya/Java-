import java.util.*;

public class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char operator = sc.next().charAt(0); // used to take input as singile char
        int b = sc.nextInt();
        //char operator = sc.next().charAt(0); // used to take input as singile char

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("not valid");

        }

    }

}

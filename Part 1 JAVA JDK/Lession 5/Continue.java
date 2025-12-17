import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        // for (int i = 0; i < 10; i++) {
        // if (i == 2) { // it print only 0 and 1
        // continue;
        // }
        // System.out.println(i);
        // }
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        do {
            int a = sc.nextInt();
            if (a % 10 == 0) {
                continue;
            }
            System.out.println(a);
        } while (true);
    }

}

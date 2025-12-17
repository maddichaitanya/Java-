import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        System.out.print("enter nunber : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 5;

        while (i <= n) {
            // System.out.println((i));
            sum += i;

            i++;

        }
        System.out.println(sum);

    }

}

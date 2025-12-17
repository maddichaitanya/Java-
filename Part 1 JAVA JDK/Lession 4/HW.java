import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {

            System.out.println("negative number ");
        } else {
            System.out.println("positve number ");
        }

        // int a = 63, b = 36;
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;

        // System.out.println(x);
        // System.out.println(y);

    }

}

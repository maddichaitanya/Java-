import java.util.Scanner;

/**
 * Fever
 */
public class Fever {

    public static void main(String[] args) {
        System.out.print("Enter Temperature here : ");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        if (temp > 103.5) {
            System.out.println("Fever positive");
        } else {
            System.out.println("No fever");
        }

    }
}
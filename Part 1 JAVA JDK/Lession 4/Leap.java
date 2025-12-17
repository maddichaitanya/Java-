import java.util.*;

class Leap {
    public static void main(String[] args) {
        System.out.print("Enter year here : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4000 == 0) {
            System.out.println(year + " is a leap year ");
        } else if (year % 100 == 0) {
            System.out.println(year + " is leap year ");

        }

        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year ");

        }
    }
}
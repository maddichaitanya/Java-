import java.util.Scanner;

//Write a Java program to input week number(1-7) and print day of
// week name using switch case

public class Week {
    public static void main(String[] args) {
        System.out.print("Enter year Week between 1-7 : ");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("TGIF!");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:

                System.out.println("Enter correct week between 1-7 weeks only");
        }
    }

}

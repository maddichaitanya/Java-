
import java.util.*;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * String input = sc.next();
         * 
         * System.out.println("Enter String is  " + input);
         */
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter your Gender ");
        String gender = sc.next();
        System.out.println("Enter your Age ");
        int age = sc.nextInt();
        System.out.println("Enter your Phone number ");
        Long phone = sc.nextLong();
        System.out.println("Enter your GPA ");
        double gpa = sc.nextDouble();

        System.out.println("your Name : " + name);
        System.out.println("your Gender : " + gender);
        System.out.println("your Age : " + age);
        System.out.println("your Phone no : " + phone);
        System.out.println("your GPA : " + gpa);

    }

}

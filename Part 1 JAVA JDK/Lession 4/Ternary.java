import java.util.*;

public class Ternary {
    public static void main(String args[]) {

        // String type = (5 % 2 == 0) ? "even" : "odd";
        System.out.print("Enter Student marks : ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String type = (marks <= 33) ? "fail" : "pass";
        System.out.println(type);
    }
}

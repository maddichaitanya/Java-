import java.util.*;

class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);

        System.out.println("length of Sytring : " + name.length());

        // concatenation of two String using +

        String str1 = "Maddi";
        String str2 = "Chaitanya";
        String full = str1 + " " + str2;

        System.out.println(full.charAt(0));

        for (int i = 0; i < full.length(); i++) {
            System.out.print(full.charAt(i) + " ");
        }

        System.out.println(full);

        // indexof used to find the char in string

        System.out.println(full.indexOf("chai"));

        // toUpperCase
        System.out.println(full.toUpperCase());

        // toLowerCase
        System.out.println(full.toLowerCase());

    }
}
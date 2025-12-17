public class Palindrome {
    public static void palindrome(int n) {
        int r, sum = 0, temp; // It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    public static void main(String[] args) {
        palindrome(123);
    }

}

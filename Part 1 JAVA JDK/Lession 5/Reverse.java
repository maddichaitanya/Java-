public class Reverse {

    // we use module % to print the given digit in reverse and also use while loop

    public static void main(String[] args) {
        int n = 1009;
        while (n > 0) {

            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;

        }
    }

}

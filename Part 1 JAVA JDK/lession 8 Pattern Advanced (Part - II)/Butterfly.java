public class Butterfly {

    public static void butterfly(int n) {
        // 1 st half outer loop
        for (int i = 0; i <= n; i++) {
            // start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space 2(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            // start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half outer loop
        for (int i = n; i >= 1; i--) {
            // start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space 2(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            // start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(4);

    }

}

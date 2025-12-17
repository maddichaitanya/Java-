public class BonusClass {

    // public static void triangle(int n) {
    // for (int i = 1; i <= n; i++) {
    // // space
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // // stars
    // for (int j = 1; j <= i; j++) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }
    // }

    public static void plaindromicpattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // desending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // asscending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // triangle(4);
        plaindromicpattern(4);
    }

}

public class RotatedHalfPyramid {
    // public static void rotated_half_pyramid(int n) {
    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= n - i; j++) {
    // // for (int j = 1; j <= n - i; j++) not inverted pyramid
    // System.out.print(" ");
    // }
    // // stars
    // for (int j = 1; j <= i; j++) {
    // // System.out.print(" * ");

    // }
    // System.out.println();

    // }

    // }

    public static void rotated_half_pyramid_number(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i + 1; j++) {
                // for (int j = 1; j <= n - i; j++) not inverted pyramid
                System.out.print(j + "   ");
            }
            // stars
            // for (int j = 1; j <= i; j++) {
            // System.out.print(" ");

            // }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        rotated_half_pyramid_number(5);
    }

}

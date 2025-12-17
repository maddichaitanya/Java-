class HellowRectangle {

    public static void hellowrectanfle(int rows, int cols) {
        // outer loop
        for (int i = 1; i <= rows; i++) {
            // inner loop
            for (int j = 1; j <= cols; j++) {
                // cell (i(row),j(col))
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");

                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        hellowrectanfle(4, 5);

    }
}
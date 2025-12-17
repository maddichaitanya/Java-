class Pattern {
    public static void main(String[] args) {
        // for (int i = 0; i <= 4; i++) {
        // for (int j = 4; j > i; j--) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // int a = 0;
        // while (a <= 4) {
        // System.out.println("*");
        // a++;
        // }

        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
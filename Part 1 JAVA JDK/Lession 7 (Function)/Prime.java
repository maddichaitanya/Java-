class Prime {
    // public static boolean prime(int n) {
    // if (n == 2) {
    // return true;

    // }
    // for (int i = 2; i <= n - 1; i++) {
    // if (i % 2 == 0) {
    // return false;
    // }

    // }
    // return true;
    // }

    public static boolean prime(int n) {
        if (n == 2) {
            return true;

        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void primrang(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        // System.out.println("Number is prime : " + prime(10));
        primrang(100);
    }
}
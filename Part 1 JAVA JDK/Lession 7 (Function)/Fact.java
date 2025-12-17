public class Fact {
    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;

    }

    public static void main(String[] args) {
        int c = factorial(4);
        System.out.println("factorial of a :" + c);
    }

}

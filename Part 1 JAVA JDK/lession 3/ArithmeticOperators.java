public class ArithmeticOperators {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        // binary
        System.out.println("+ operator : " + (a + b));
        System.out.println("- operator : " + (a - b));
        System.out.println("* operator : " + (a * b));
        System.out.println("/ operator : " + (a / b));
        System.out.println("% operator : " + (a % b));

        // unary

        // per inc/dec first change value then use
        System.out.println("++ operator : " + (++a));
        System.out.println("-- operator : " + (--b));

        // post inc/dec first use value then use
        int c = a++;
        int d = b--;
        System.out.println("a++ value is " + c);
        System.out.println("b-- value is " + d);

    }
}

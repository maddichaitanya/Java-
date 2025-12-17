public class Max {
    public static void main(String[] args) {
        int a, b, c;
        a = 100;
        c = 90;
        b = 30;

        /*
         * One types
         * if (a > b) {
         * System.out.println("a is greater than " + a);
         * }
         * 
         * else if (a > c) {
         * System.out.println("a is greater than " + a);
         * }
         * 
         * else if (b > c) {
         * System.out.println("b is greater than all 3 number" + b);
         * 
         * } else {
         * System.out.println("c " + c);
         * 
         * }
         */

        // 2nd type

        if (a > b && a > c) {
            System.out.println("a is greater than " + a);
        } else if (b > a && b > c) {
            System.out.println("b is greater than " + b);
        } else {
            System.out.println("c is greater than " + c);
        }

    }
}
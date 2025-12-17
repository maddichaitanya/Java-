public class EvenOdd {

    // public static String evenodd(int n) {
    // String ans = (n % 2 == 0) ? "True" : "False";
    // return ans;
    // }

    public static boolean evenodd(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        // String a = evenodd(3);
        // System.out.println(a);

        boolean a = evenodd(2);
        System.out.println(a);

    }
}
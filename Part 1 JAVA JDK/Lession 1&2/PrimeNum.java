import java.util.ArrayList;

public class PrimeNum {

    public static void main(String[] args) {
        /*
         * int n = 3;// to be check
         * boolean prime = true;
         * 
         * for (int i = 2; i <= n; i++) {
         * if (i == 0) {
         * prime = false;
         * 
         * }
         * }
         * System.out.println(prime);
         */

        ArrayList<Integer> primelList = new ArrayList<>();

        int max = 1000;
        for (int x = 2; x <= max; x++) {
            boolean prime = true;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    prime = false;
                    break;
                }

                if (prime)
                    primelList.add(x);
            }
        }
        System.out.println(primelList);
    }
}

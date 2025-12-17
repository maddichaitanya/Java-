public class BiomialCoef {

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;

    }

    public static int biocoef(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n - r);

        int biomialCoef = fact_n / (fact_r * fact_nr);
        return biomialCoef;

    }

    public static void main(String[] args) {
        int c = biocoef(5, 2);
        System.out.println("Biomial Coefficant : " + c);

    }

}

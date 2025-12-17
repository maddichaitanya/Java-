public class DoWhile {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        do {
            System.out.println(a);
            sum += a;

            a++;
        } while (a <= 5);

        System.out.print("sum of number is : " + sum);

    }

}

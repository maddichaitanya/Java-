public class Swap {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value a: " + a);
        System.out.println("value of b: " + b);
    }

    public static void main(String[] args) {
        int a = 200;
        int b = 30;
        swap(a, b);

        System.out.println("value a: " + a);
        System.out.println("value of b: " + b);

    }

}

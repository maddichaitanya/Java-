public class Overloading {

    // public static int sum(int a, int b) {
    // return a + b;
    //

    // public static int sum(int a,int b,int
    // retur n a +b
    // }

    // using data type
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        int c = sum(2, 3);
        float d = sum(2f, 3f);
        System.out.println(c);
        System.out.println(d);

    }
}

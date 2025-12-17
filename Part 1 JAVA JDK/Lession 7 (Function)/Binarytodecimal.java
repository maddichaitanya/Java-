public class Binarytodecimal {

    // conver binary to decimal

    public static void bintobin(int bin) {
        int mynum = bin;
        int pow = 0; // power var
        int dec = 0; // decimal var
        while (bin > 0) {
            int lastdigt = bin % 10;
            dec = dec + (lastdigt * (int) Math.pow(2, pow)); // double pow(base ,power) also return dobule value
            pow++;
            bin = bin / 10;

        }
        System.out.println(" binary number = " + mynum + " decmal is = " + dec);
    }

    // conver dec to binary

    public static void dectobin(int n) {
        int mynum = n;
        int pow = 0;
        int bin = 0;
        while (n > 0) {

            int reminder = n % 2;
            bin = bin + (reminder * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("decimal = " + mynum + "binary from of number = " + bin);

    }

    public static void main(String[] args) {
        bintobin(1000);
        dectobin(8);
    }
}

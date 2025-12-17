public class Pairs {

    public static void pairs(int number[]) {
        int total = 0; // total pairs
        for (int i = 0; i < number.length - 1; i++) {
            int curr = number[i]; // current element
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                total++;

            }
            System.out.println();
        }
        System.out.println("Total parse are : " + total);
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        pairs(number);

    }

}

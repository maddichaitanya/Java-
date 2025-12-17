public class SubArray {
    public static void subarray(int number[]) {
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    total++;

                }
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total number of subarrays are = " + total);
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        subarray(number);

    }

}

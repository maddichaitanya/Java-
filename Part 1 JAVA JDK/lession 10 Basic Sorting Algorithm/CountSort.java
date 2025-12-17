public class CountSort {
    public static void count(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]); // finding range or max value
        }
        int count[] = new int[largest + 1];// creating count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // inserting ele in count from unsorted array
        }

        // sorting
        int j = 0; // updating values
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--; // frequency
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 4, 1, 2 };

        count(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

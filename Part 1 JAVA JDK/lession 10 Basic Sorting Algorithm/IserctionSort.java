public class IserctionSort {
    public static void insert(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = i - 1;
            // finding out the correct position to insert
            while (pre >= 0 && arr[pre] > curr) {
                arr[pre + 1] = arr[pre];
                pre--;
            }
            // insertion
            arr[pre + 1] = curr;

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 1, 2 };

        insert(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class BubbleSort {
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) { // turn=n (turn-1 total steps)
            for (int j = 0; j < arr.length - 1 - turn; j++) { // single step = n -2 - turn
                // or for(int j = 0; j <= arr.length - 2 - turn; j++)
                if (arr[j] > arr[j + 1]) { // compare first element with second element
                    // swaping if condion ture
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }
    }

    // creating another fundtion to print the array
    // public static void printarray(int arr[]) {
    // System.out.println("After sorting algorithm : ");
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");

    // }
    // System.out.println();
    // }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        System.out.println("Before sorting algorithm : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubblesort(arr);
        // printarray(arr);
        System.out.println("After sorting algorithm : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
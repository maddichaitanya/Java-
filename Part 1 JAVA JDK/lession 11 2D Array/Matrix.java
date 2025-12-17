import java.util.Scanner;

class Matrix {
    public static boolean search(int matrix[][], int key) {
        int n = matrix.length, m = matrix[0].length; // n= row m=column

        for (int i = 0; i < n; i++) { // row
            for (int j = 0; j < m; j++) { // column
                if (matrix[i][j] == key) {
                    System.out.println("element founded : " + "(" + i + "," + j + ")");
                    return true;

                }

            }
        }
        System.out.println("element not founded");
        return false;

    }

    public static void main(String[] args) {
        // creating 2D array

        // int matrix[][] = { { 1, 2, 3 }, { 2, 3, 4 } };
        // int a = matrix[0][0]; // row //colunm
        // System.out.println(a);

        int matrix[][] = new int[3][3]; // creating 2D array
        int n = matrix.length, m = matrix[0].length; // n= row m=column
        System.out.println("Enter your matrix : ex: 1 2 3 4 . . . n+m=9");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) { // row
            for (int j = 0; j < m; j++) { // column
                matrix[i][j] = sc.nextInt();

            }
        }
        // output
        for (int i = 0; i < n; i++) { // row
            for (int j = 0; j < m; j++) { // column
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        search(matrix, 5);

    }
}
public class SerachSorted {
    public static boolean serch(int martix[][], int key) {
        int row = 0;
        int col = martix[0].length - 1;
        while (row < martix.length && col > +0) {
            if (martix[row][col] == key) {
                System.out.println(" Founded key at (" + row + "," + col + ")");
                return true;

            } else if (key < martix[row][col]) {
                col--;

            } else {
                row++;
            }

        }
        System.out.println("key not founded");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int key = 7;

        serch(matrix, key);
    }

}

public class Spiral {
    public static void spiral(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcolm = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcolm) { // checking condition for start and end col and row
            // top boundery
            // start col to ending colm
            for (int j = startcol; j <= endcolm; j++) { // 1) left to right
                System.out.print(matrix[startrow][j] + " ");

            }

            // lastcolm right (top to bottom)
            // star row+1 to end endrow
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcolm] + " ");

            }

            // lastrow bottom (rigth to left )
            // endcolm-1 to sc
            for (int j = endcolm - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break; // 5*5 martix

                }
                System.out.print(matrix[endrow][j] + " ");

            }

            // left ( endrow-1 to startrow+1)
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endrow) {
                    break; // 5*5 martix

                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcolm--;
            endrow--;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        spiral(matrix);

    }
}

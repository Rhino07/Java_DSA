
public class Matrices {

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    void max(int Matrix[][]) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                max = Math.max(max, Matrix[i][j]);
                min = Math.min(min, Matrix[i][j]);
            }
        }
        System.out.println();
        System.out.println("Max Element = " + max);
        System.out.println("Min Element = " + min);

    }

    void spiral(int Matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = Matrix.length - 1;
        int endCol = Matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            //top part
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(Matrix[startRow][j] + " ");
            }

            //right part
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(Matrix[i][endCol] + " ");

            }

            //bottom
            // for (int j = endCol - 1; j >= startCol; j--) {
            //     if (startRow == endRow) {
            //         break;
            //     }
            //     System.out.print(Matrix[endRow][j] + " ");
            // }
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(Matrix[endRow][j] + " ");
                }
            }

            //left
            // for (int i = endRow - 1; i >= startRow; i--) {
            //     if (startCol == endCol) {
            //         break;
            //     }
            //     System.out.print(Matrix[i][startCol] + " ");
            // }
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(Matrix[i][startCol] + " ");
                }
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

    }

    void diagonalSum(int Matrix[][]) {
        int sum = 0;

        for (int i = 0; i < Matrix.length; i++) {
            sum = sum + Matrix[i][i];

            if (i != Matrix.length - 1 - i) {
                sum = sum + Matrix[i][Matrix.length - 1 - i];

            }
        }
        // int m = Matrix.length - 1;
        // int n = 0;
        // while (m >= 0 && n < Matrix.length) {
        //     sum = sum + Matrix[m][n];
        //     m--;
        //     n++;
        // }
        System.out.println("Sum = " + sum);
    }

    void sortedMatrix(int Matrix[][], int key) {
        int l = Matrix.length;

        int row = l - 1, col = 0;

        while (row >= 0 && col < l) {
            if (Matrix[row][col] == key) {
                System.out.println("Found at i = " + row + " " + "j = " + col);
            }
            if (key > Matrix[row][col]) {
                col++;
            } else {
                row--;
            }

        }

    }

    public static void main(String[] args) {
        Matrices m1 = new Matrices();

        // int M = Matrix.length, N = Matrix[0].length;
        // for (int i = 0; i < M; i++) {
        //     for (int j = 0; j < N; j++) {
        //         Matrix[i][j] = m.nextInt();
        //     }
        // }
        int[][] Matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        m1.sortedMatrix(Matrix, 33);
    }
}

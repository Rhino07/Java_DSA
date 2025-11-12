
public class Practice {

    int countOf7(int matrix[][]) {
        int count = 0;

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println(count);

        return count;
    }

    void sum(int nums[][]) {
        int i = 1;
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum = sum + nums[i][j];
        }
        System.out.println(sum);

    }

    void transpose(int nums[][]) {
        int row = nums.length;
        int col = nums[0].length;

        int[][] trans = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i] = nums[i][j];

            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Practice p = new Practice();

        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix = {
            {4, 7, 8},
            {8, 8, 7}
        };

        p.transpose(nums);
    }
}

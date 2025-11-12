
public class Gridways {

    public static int gridwaysCount(int i, int j, int m, int n) {

        if (j == n - 1 && i == m - 1) {
            return 1;
        } else if (i == m || j == n) {
            return 0;
        }

        return gridwaysCount(i + 1, j, m, n) + gridwaysCount(i, j + 1, m, n);

    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;

        System.out.println(gridwaysCount(0, 0, m, n));
    }
}

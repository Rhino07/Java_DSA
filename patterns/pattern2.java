
public class pattern2 {

    void hollow_rect(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();// <-- This moves to the next line after each row

        }
    }

    void invPyramid(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");// remove one space and it becomes the mirror of this

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");//Prints no. of stars after the space

            }
            System.out.println();
        }
    }

    void invHalfNoPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    void floydsTri(int n) {
        int count = 1;

        for (int i = 1; i <= n; i++) //tracks no. of lines or rows
        {
            for (int j = 1; j <= i; j++)// how many elements in a row gets printed
            {

                System.out.print(count + " ");
                count++;

            }
            System.out.println();

        }
    }

    void zeroOneTri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");

                }
            }
            System.out.println();

        }
    }

    void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            int space = 2 * (n - i);

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            int space = 2 * (n - i);

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    void Hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern2 p = new pattern2();
        p.diamond(5);

    }
}

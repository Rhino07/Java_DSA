
import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter size of the integer list");
        // int size = sc.nextInt();
        // int evenSum = 0;
        // int oddSum = 0;
        // for (int i = 1; i <= size; i++) {
        //     int n = sc.nextInt();
        //     if (n % 2 == 0) {
        //         evenSum += n;
        //     } else {
        //         oddSum += n;
        //     }
        // }
        // System.out.println("Sum of even numbers: " + evenSum);
        // System.out.println("Sum of odd numbers: " + oddSum);
        int m = 4;
        int factorial = 1;
        for (int j = m; j >= 1; j--) {
            factorial *= j;
        }
        System.err.println(factorial);
    }
}

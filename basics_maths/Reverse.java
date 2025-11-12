
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //     int a = sc.nextInt();
        //     String b = (a > 0) ? "Positive" : "negative";
        //     System.out.println(b);
        int n = 10899;
        String Reverse = "";

        while (n > 0) {

            int digit = n % 10;
            Reverse = Reverse + digit;
            n = n / 10;
        }
        System.out.println(Reverse);
    }
}

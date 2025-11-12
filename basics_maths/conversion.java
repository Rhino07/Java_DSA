
public class conversion {

    public void Biconversion(int n) {
        int Ld;
        int p = 0;
        int Dec = 0;
        int temp;
        while (n != 0) {
            Ld = n % 10;
            temp = (int) (Ld * Math.pow(2, p));
            Dec = Dec + temp;

            n = n / 10;
            p++;
        }
        System.err.println(Dec);
    }

    public void Decconversion(int m) {
        int Bi = 0;
        int p = 0;
        int div;
        while (m > 0) {
            div = m % 2;

            Bi = Bi + (div * (int) Math.pow(10, p));
            p++;
            m = m / 2;

        }
        System.out.println(Bi);

    }

    public static void main(String[] args) {
        conversion c = new conversion();
        // c.Biconversion(101);
        c.Decconversion(5);
    }
}


public class prime {

    public void prime_no(int n) {
        int div = 2;
        boolean isPrime = true;
        while (div <= Math.sqrt(n)) // much optimal than div<=n-2
        {

            if (n % div == 0) {
                isPrime = false;
            }
            div++;
        }
        if (isPrime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("NotPrime");
        }
    }

    public static void main(String[] args) {
        prime p = new prime();
        p.prime_no(211);
    }
}

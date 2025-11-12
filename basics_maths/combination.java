
public class combination {

    int combi(int n) {
        int j = 1;
        // int k = 1;
        // int l = 1;
        for (int i = 1; i <= n; i++) {
            j = i * j;
            // k = i * k;
        }
        // for (int i = 1; i <= n - r; i++) {
        //     l = i * l;
        // }
        return j;
    }

    int binomial(int n, int r) {
        int fact_n = combi(n);
        int fact_r = combi(r);
        int fact_n_r = combi(n - r);

        return fact_n / (fact_r * fact_n_r);
    }

    public static void main(String[] args) {
        combination c = new combination();

        System.out.println(c.binomial(5, 2));
    }
}

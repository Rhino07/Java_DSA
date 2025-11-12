
import java.util.ArrayList;

public class Pairsum {
//      Optimized O(N)

    public static boolean pairsum(ArrayList<Integer> List, int target) {

        int Lp = 0;
        int Rp = List.size() - 1;

        while (Lp < Rp) {

            if (List.get(Lp) + List.get(Rp) == target) {
                return true;
            } else {
                Rp--;
            }

        }
        return false;

    }

    public static boolean pairSum2(ArrayList<Integer> List, int target) {
        int p = -1;
        int n = List.size();
        for (int i = 0; i < n - 1; i++) {
            if (List.get(i) > List.get(i + 1)) {
                p = i;
                break;
            }
        }
        int L = p + 1;
        int R = p;
        while (L != R) {
            if (List.get(L) + List.get(R) == target) {
                return true;
            }
            if (List.get(L) + List.get(R) < target) {
                L = (L + 1) % n;
            } else {
                R = (R + n - 1) % n;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();

        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);

        System.out.println(pairSum2(List, 16));

    }
}

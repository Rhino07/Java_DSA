
import java.util.ArrayList;

public class Container {

    public static void MaxArea(ArrayList<Integer> h) {
        int maxWater = 0;

        for (int i = 0; i < h.size(); i++) {
            for (int j = i + 1; j < h.size(); j++) {
                int ht = Math.min(h.get(i), h.get(j));
                int width = j - i;

                int currWater = ht * width;
                maxWater = Math.max(currWater, maxWater);

            }
        }
        System.out.println(maxWater); // Brute force
    }

    public static void main(String[] args) {

        ArrayList<Integer> h = new ArrayList<>();

        h.add(1);
        h.add(8);
        h.add(6);
        h.add(2);
        h.add(5);
        h.add(4);
        h.add(8);
        h.add(3);
        h.add(7);

        MaxArea(h);

    }
}

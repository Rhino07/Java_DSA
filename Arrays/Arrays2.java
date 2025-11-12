
public class Arrays2 {

    void MaxSum_BruteForce(int[] Array) { // Complexity O(n^3)
        int ts = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < Array.length; i++) {
            int start = i;
            for (int j = i; j < Array.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    // System.out.print(SortedArray[k] + ",");

                    sum = sum + Array[k];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                    if (sum < minSum) {
                        minSum = sum;
                    }
                }
                System.out.print("Sum = " + sum);

                sum = 0;

                ts++;

                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total SubArr " + ts);
        System.out.println("MaxSum " + maxSum);
        System.out.println("MinSum " + minSum);

    }

    void MaxSum_Prefix(int Array[]) {
        int sum = 0;
        int prefix[] = new int[Array.length];
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = Array[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + Array[i];
        }

        for (int i = 0; i < Array.length; i++) {//O(n^2)
            int start = i;
            for (int j = i; j < Array.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // removes extra k loop from above
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }

    void maxSum_kadane(int Array[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean arrNegative = true;
        for (int i = 0; i < Array.length; i++) {

            if (Array[i] > 0) {
                arrNegative = false;
            }

            sum = sum + Array[i]; //O(n)

            if (sum < 0) {
                sum = 0;
            }
            if (sum > maxSum) {
                maxSum = sum; //Math.max(sum,maxSum)
            }
        }

        if (arrNegative) {
            maxSum = Array[0];

            for (int i = 0; i < Array.length; i++) {
                if (Array[i] > maxSum) {
                    maxSum = Array[i];
                }
            }

        }
        System.out.println("Max Sum = " + maxSum);

    }

    public static void main(String[] args) {
        Arrays2 a2 = new Arrays2();
        int[] Array = {-2, -3, -1, -2, -3};
        a2.maxSum_kadane(Array);

    }
}

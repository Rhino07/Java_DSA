
public class Arrays1 {

    void largest(int[] array) {
        int largest = 0;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }

        }
        System.out.println(largest);
        System.out.println(smallest);

    }

    void binarySearch(int[] SortedArray, int key) {
        int n = SortedArray.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (SortedArray[mid] == key) {
                System.out.println("Key found at " + mid);
                break;
            } else if (SortedArray[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

    }

    int reverse(int[] SortedArray) {
        int start = 0;
        int end = SortedArray.length - 1;

        while (start < end) {
            int temp = SortedArray[end];
            SortedArray[end] = SortedArray[start];
            SortedArray[start] = temp;

            start++;
            end--;
        }

        return 0;
    }

    void pairs(int[] SortedArray) {
        int tp = 0;
        for (int i = 0; i < SortedArray.length; i++) {
            for (int j = i + 1; j < SortedArray.length; j++) {
                System.out.print("(" + SortedArray[i] + "," + SortedArray[j] + ")");
                tp++;
            }
            System.out.println();
        }// in interview total pairs can be asked
        System.err.println("Total=" + tp);
    }

    public static void main(String[] args) {
        Arrays1 a = new Arrays1();

        int SortedArray[] = {2, 4, 6, 8, 10};
    }
}

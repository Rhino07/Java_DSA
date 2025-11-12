
public class Recursion1 {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);

        return fn;
    }

    public static int sumN(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = sumN(n - 1);
        int fn = n + fnm1;

        return fn;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibNm1 = fib(n - 1);
        int fibNm2 = fib(n - 2);
        return fibNm1 + fibNm2;

    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        int found = lastOccurence(arr, key, i + 1);

        if (found == -1 && arr[i] == i) {
            return i;
        }
        return found;
    }

    public static void main(String[] args) {
        // Recursion1 r = new Recursion1();
        int arr[] = {1, 3, 2, 3, 4, 5};
        System.out.print(firstOccurence(arr, 3, 0));
    }
}

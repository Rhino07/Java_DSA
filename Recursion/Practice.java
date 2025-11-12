
public class Practice {

    public static void occurences(int idx, int arr[], int key) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.err.println(idx);
        }
        occurences(idx + 1, arr, key);

    }

    public static void numTostring(String num, int i) {
        String numStr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (i == num.length()) {
            return;
        }

        int idx = num.charAt(i) - '0';
        System.out.print(numStr[idx] + " ");
        numTostring(num, i + 1);

    }

    public static int length(String str, int i) {
        if (i == str.length()) {
            return 0;
        }

        return 1 + length(str, i + 1);

    }

    public static int countStartEnd(int i, int j, String str, int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        int count = countStartEnd(i + 1, j, str, n - 1) + countStartEnd(i, j - 1, str, n - 1);

        if (str.charAt(i) == str.charAt(j)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countStartEnd(0, n - 1, str, n));
    }
}

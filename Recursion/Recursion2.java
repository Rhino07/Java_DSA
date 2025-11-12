
public class Recursion2 {
//Amazon

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        //vertical
        int fnm1 = tilingProblem(n - 1);
        //horizontal
        int fnm2 = tilingProblem(n - 2);

        return fnm1 + fnm2;
    }
//Google

    public static void duplicate(int idx, String Str, StringBuilder newStr, boolean map[]) {
        if (idx == Str.length()) {
            System.out.println(newStr);
            return;
        }
        char currStr = Str.charAt(idx);

        if (map[currStr - 'a'] == true) {
            duplicate(idx + 1, Str, newStr, map);
        } else {
            map[currStr - 'a'] = true;
            duplicate(idx + 1, Str, newStr.append(currStr), map);
        }

    }
//Goldman Sachs

    public static int friends(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return friends(n - 1) + (n - 1) * friends(n - 2);
    }
//paytm

    public static void printBinaryStr(int n, int lastPlace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinaryStr(n - 1, 0, str + '0');

        if (lastPlace == 0) {
            printBinaryStr(n - 1, 1, str + '1');
        }

    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;

        }

        towerOfHanoi(n - 1, src, dest, helper);

        System.out.println("transfer disk " + n + " from " + src + " to " + dest);

        towerOfHanoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {

        towerOfHanoi(3, "A", "B", "C");
    }
}

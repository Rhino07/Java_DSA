
import java.util.Arrays;

public class Strings {

    void shortestPath(String Dir) {

        int x = 0;
        int y = 0;
        for (int i = 0; i < Dir.length(); i++) {
            if (Dir.charAt(i) == 'N') {
                y++;
            }
            if (Dir.charAt(i) == 'E') {
                x++;
            }
            if (Dir.charAt(i) == 'W') {
                x--;
            }
            if (Dir.charAt(i) == 'S') {
                y--;
            }
        }
        int path = x * x + y * y;

        double shortestpath = Math.sqrt(path);

        System.out.println(shortestpath);

    }

    public static String toUpperCase(String Dir) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(Dir.charAt(0));
        sb.append(ch);
        for (int i = 1; i < Dir.length(); i++) {

            if (Dir.charAt(i) == ' ' && i < Dir.length() - 1) {
                sb.append(Dir.charAt(i));
                i++;
                sb.append(Character.toUpperCase(Dir.charAt(i)));

            } else {
                sb.append(Dir.charAt(i));
            }

        }
        return sb.toString();
    }

    public static String compresser(String str) {
        StringBuilder sb = new StringBuilder("");

        Integer count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (count == 1) {
                sb.append(str.charAt(i));

            }

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count);
                count = 1;
            }
        }
        // sb.append(str.charAt(str.length() - 1)).append(count);
        String result = sb.toString();

        return result;
    }

    public static String compresser1(String str) {
        String newStr = "";
        Integer count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (count == 1) {
                newStr = newStr + str.charAt(i);
            }

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                newStr += count.toString();

                count = 1;
            }
        }
        // sb.append(str.charAt(str.length() - 1)).append(count);

        return newStr;
    }

    public static void anagram(String str, String Dir) {
        {
            // int i = 0;
            // int j = 0;
            // int count = 0;
            // while (i < str.length() && j < Dir.length()) {
            //     if (str.charAt(i) == Dir.charAt(j)) {
            //         i++;
            //         j = 0;
            //         count++;
            //     } else {
            //         j++;
            //     }
            // }
            // if (count == str.length()) {
            //     System.out.println("Anagram");
            // } else {
            //     System.out.println("Not Anagram");
            // }
        }
        char[] str1 = str.toCharArray();
        char[] str2 = Dir.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        String sort1 = new String(str1);
        String sort2 = new String(str2);

        {// boolean anagram = false;
            // for (int i = 0; i < sort1.length(); i++) {
            //     if (sort1.charAt(i) != sort2.charAt(i)) {
            //         anagram = false;
            //         break;
            //     } else {
            //         anagram = true;
            //     }
            // }
            // if (anagram) {
            //     System.out.println("An Anagram");
            // } else {
            //     System.out.println("Not an Anagram");
            // }
        }
        if (sort1.equals(sort2)) {
            System.out.println("An Anagram");

        } else {
            System.out.println("Not an Anagram");

        }

    }

    public static void main(String[] args) {

        String str = "racce";

        String Dir = "carecx";
        anagram(str, Dir);
    }
}

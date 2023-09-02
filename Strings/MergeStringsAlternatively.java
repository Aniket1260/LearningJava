import java.util.Scanner;
import java.utils.*;

class MergeStringsAlternatively {
    public String mergeAlternatively(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < m) {
                result.append(word1.charAt(i));
            }
            if (i < n) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        MergeStringsAlternatively ma = new MergeStringsAlternatively();
        String mergedString = ma.mergeAlternatively(word1, word2);
        System.out.println(mergedString);
    }
}
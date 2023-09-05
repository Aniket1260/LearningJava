import java.util.*;

class PalindromeStrings {

    public static boolean isPalindrome(String word1) {
        for (int i = 0; i < word1.length() / 2; i++) {
            int n = word1.length();
            if (word1.charAt(i) != word1.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        System.out.println(isPalindrome(word1));
    }
}

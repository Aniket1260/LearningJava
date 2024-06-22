package dsa.java;
import java.util.*;
public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (StringIsPalindromeOrNot.isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
		sc.close();
	}
		public static boolean isPalindrome(String str) {
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = charArray.length -1;
		while(start<end) {
			if(charArray[start] != charArray[end]) {
				return false;
			}
			start ++;
			end --;
		}
		return true;
	}
}

package dsa.java;

import java.util.Stack;

public class ReverseAString {
	public static String reverse(String str) {
		Stack<Character> stack= new Stack<>();
		char[] chars = str.toCharArray();
		for(char c : chars) {
			stack.push(c);
	}
		for(int i =0;i<str.length();i++) {
			chars[i] = stack.pop();
		}
		return new String(chars);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCD";
		System.out.println("Before Reverse - "+ str);
		System.out.print("After Reverse - "+ reverse(str));
	}
}

package dsa.java;

import java.util.Stack;

public class ValidParenthesis {
	static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		for(char c : str.toCharArray()) {
			if(c=='(' || c == '{' || c == '[') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					char top = stack.peek();
					if(c=='}' && top =='{' || c == ']' && top == '[' || c == ')' && top == '(') {
						stack.pop();
					}
					else {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{]";
		System.out.print(isValid(str));
	}

}

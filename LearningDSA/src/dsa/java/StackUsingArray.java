package dsa.java;

public class StackUsingArray {
	private int top;
	private int[] arr;
	public StackUsingArray(int capacity) {
		top = -1;
		arr = new int[capacity];
	}
	public StackUsingArray() {
		this(10);
	}
	public void push(int data) {
		if(isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		top++;
		arr[top] = data;
	}
	public boolean isFull() {
		return arr.length == size();
	}
	public int size() {
		return top+1;
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		int result = arr[top];
		top--;
		return result;
	}
	public boolean isEmpty() {
		return top<0;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return arr[top];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray sua = new StackUsingArray();
		sua.push(2);
		sua.push(4);
		sua.push(6);
		sua.push(8);
		System.out.println(sua.peek());
		sua.pop();
		System.out.println(sua.peek());
	}

}
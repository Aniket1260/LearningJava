package dsa.java;

import java.util.EmptyStackException;

public class StackUsingLinkedList {
	private ListNode top;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
		}
	}
	public StackUsingLinkedList() {
		top = null;
		length = 0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	public void push(int value) {
		ListNode temp = new ListNode(value);
		temp.next = top;
		top = temp;
		length++;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length --;
		return result;
	}
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	public void display() {
		ListNode temp = top;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList sull = new StackUsingLinkedList();
		sull.push(1);
		sull.push(2);
		sull.push(3);
		sull.push(4);
		System.out.println(sull.peek()+" ");
		sull.pop();
		System.out.println(sull.peek()+" ");
		sull.display();
		sull.pop();
		sull.display();
	}
}

package dsa.java;

import java.util.NoSuchElementException;

public class Queue {
	private ListNode front;
	private ListNode rear;
	private int length;
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public Queue() {
		front = null;
		rear = null;
		length = 0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	private void enqueue(int value) {
		ListNode temp = new ListNode(value);
		if(isEmpty()) {
			front = temp;
		}
		else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		int result = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		length --;
		return result;
	}
	public void print() {
		if(isEmpty()) {
			return;
		}
		ListNode current = front;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}
	public int first() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return front.data;
	}
	public int last() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return rear.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.print();
		queue.dequeue();
		queue.print();
		System.out.println(queue.first());
		System.out.print(queue.last());
	}

}

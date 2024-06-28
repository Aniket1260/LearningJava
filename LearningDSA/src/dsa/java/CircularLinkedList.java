package dsa.java;

import java.util.NoSuchElementException;

public class CircularLinkedList {
	private ListNode last;
	private int length;
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
		}
	}
	public CircularLinkedList() {
		last = null;
		length = 0;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	 public int length() {
	      return length;
	   }
	 public void createCircularLinkedList() {
		 ListNode first = new ListNode(4);
		 ListNode second = new ListNode(5);
		 ListNode third = new ListNode(6);
		 ListNode fourth = new ListNode(7);
		 first.next = second;
		 second.next = third;
		 third.next = fourth;
		 fourth.next = first;
		 last = fourth;
		 length = 4;
	 }
	 public void display() {
		 if(last == null) {
			 return;
		 }
		 ListNode first = last.next;
		 while(first != last) {
			 System.out.print(first.data + " ");
			 first = first.next;
		 }
		 System.out.println(first.data + " ");
	 }
	 public void insertAtBeginning(int value) {
		 ListNode temp = new ListNode(value);
		 if(last == null) {
			 last = temp;
		 }
		 else {
			 temp.next = last.next;
		 }
		 last.next = temp;
		 length++;
	 }
	 public void insertAtEnd(int value) {
		 ListNode temp = new ListNode(value);
		 if(last == null) {
			 last = temp;
			 last.next = last;
		 }
		 else {
			 temp.next = last.next;
			 last.next = temp;
			 last = temp;
		 }
		 length++; 
	 }
	 public ListNode removeFromBeginning() {
		 if(isEmpty()) {
			 throw new NoSuchElementException();
		 }
		 ListNode temp = last.next;
		 if(last.next==last) {
			 last = null;
		 }
		 else {
			 last.next = temp.next;
		 }
		 temp.next = null;
		 length--;
		 return temp;
	 }
	public static void main(String args[]) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.createCircularLinkedList();
		cll.display();
		cll.insertAtBeginning(1);
		cll.display();
		cll.insertAtEnd(9);
		cll.display();
		cll.removeFromBeginning();
		cll.display();
	}
}
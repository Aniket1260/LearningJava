package dsa.java;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	public ListNode head;
	public ListNode tail;
	private int length;
	private class ListNode{
		private int data;
		private ListNode previous;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
		}
	}
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	 public int length() {
	      return length;
	   }
	 public void displayForward() {
		 if(head == null) {
			 return;
		 }
		 ListNode temp = head;
		 while(temp != null) {
			 System.out.print(temp.data + "-->");
			 temp = temp.next;
		 }
		 System.out.println("null");
	 }
	 public void displayBackward() {
		 if(tail == null) {
			 return;
		 }
		 ListNode temp = null;
		 while(temp != null) {
			 System.out.print(temp.data + "-->");
			 temp = temp.previous;
		 }
		 System.out.println("null");
	 }
	 public void insertBeginning(int value) {
		 ListNode newNode = new ListNode(value);
		 if(isEmpty()) {
			 tail = newNode;
		 }
		 else {
			 head.previous = newNode;
		 }
		 newNode.next = head;
		 head = newNode;
		 length++;
	 }
	 public void insertEnd(int value) {
		 ListNode newNode = new ListNode(value);
		 if(isEmpty()) {
			 head = newNode;
		 }
		 else {
			 tail.next = newNode;
		 }
		 newNode.previous = tail;
		 tail = newNode;
		 length++;
	 }
	 public ListNode deleteAtBeginning() {
		 if(isEmpty()) {
			 throw new NoSuchElementException();
		 }
		 ListNode temp = head;
		 if(head == null) {
			 tail = null;
		 }
		 else {
			 head.next.previous = null;
		 }
		 head = head.next;
		 temp.next = null;
		 length--;
		 return temp;
	 }
	 public ListNode deleteAtEnd() {
		 if(isEmpty()) {
			 throw new NoSuchElementException();
		 }
		 ListNode temp = tail;
		 if(tail == head) {
			 head = null;
		 }
		 else {
			 tail.previous.next = null;
		 }
		 tail = tail.previous;
		 temp.previous = null;
		 length--;
		 return temp;
	 }
	 public static void main(String[] args) {
	      DoublyLinkedList dll = new DoublyLinkedList();
	      dll.insertBeginning(4);
	      dll.insertEnd(6);
	      dll.insertBeginning(5);
	      dll.displayForward();
	      dll.deleteAtEnd();
	      dll.displayForward();
	   }
}

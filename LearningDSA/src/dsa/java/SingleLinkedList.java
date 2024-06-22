package dsa.java;

public class SingleLinkedList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.print("\n");
	}
	public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	public void insertAtBeginning(int value) {
		ListNode NewNode = new ListNode(value);
		NewNode.next = head;
		head = NewNode;
	}
	public void insertAtEnd(int value) {
		ListNode NewNode = new ListNode(value);
		if(head == null) {
			head = NewNode;
			return;
		}
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = NewNode;
	}
	public void insertAtPosition(int value,int position) {
		ListNode node = new ListNode(value);
		if(position == 1) {
			node.next = head;
			head = node;
		}else {
		int count = 1;
		ListNode previous = head;
		while(count < position-1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		node.next = current;
		previous.next = node;
		}
	}
	
	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	public ListNode deleteEnd() {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode previous = null;
		ListNode current = head;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	public void deleteAtPosition(int position) {
		if(position == 1) {
			head = head.next;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while(count < position-1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	public boolean searchLinkedList(int key) {
		ListNode current = head;
		while(current.next != null) {
			if(current.data == key) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public void reverseLinkedList() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	public ListNode nthNodeFromLast(int n) {
		ListNode mainptr = head;
		ListNode refptr = head;
		int count = 1; 
		while(count < n) {
			refptr = refptr.next;
			count++;
		}
		while(refptr != null) {
			refptr = refptr.next;
			mainptr = mainptr.next;
		}
		return mainptr;
	}
	public ListNode findMiddleNode() {
		ListNode slowptr = head;
		ListNode fastptr = head;
		while(fastptr != null && fastptr.next!=null) {
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
		}
		return slowptr;
	}
	public void deleteDuplicateFromSortedLinkedList() {
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
		}
	}
	public ListNode insertNodeInSortedList(int value){
		ListNode current = head;
		ListNode temp = null;
		ListNode newNode = new ListNode(value);
		while(current!=null && current.data < newNode.data ) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next= newNode;
		return head;
	}
	public ListNode removeKeyFromLinkedList(int key) {
		ListNode current = head;
		ListNode temp = null;
		while(current !=null && current.data!= key) {
			temp = current;
			current = current.next;
		}
		if(current == null) return head;
		temp.next = current.next;
		return head;
	}
	public boolean detectLoopInASingleLinkedList() {
		ListNode slowptr = head;
		ListNode fastptr = head;
		while(fastptr.next!=null && fastptr.next.next!=null) {
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			if(slowptr == fastptr) {
				return true;
			}
		}
		return false;
	}
	public ListNode detectStartOfLoopInASingleLinkedList() {
		ListNode slowptr = head;
		ListNode fastptr = head;
		while(fastptr.next!=null && fastptr.next.next!=null) {
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			if(slowptr == fastptr) {
				return getStartingNodeOfALoop(slowptr);
			}
		}
		return null;
	}
	public ListNode getStartingNodeOfALoop(ListNode slowptr) {
		ListNode temp = head;
		while(slowptr != temp){
			temp = temp.next;
			slowptr = slowptr.next;
		}
		return temp;
	}
	
	public ListNode removeLoopInASingleLinkedList() {
			ListNode slowptr = head;
			ListNode fastptr = head;
			while(fastptr.next!=null && fastptr.next.next!=null) {
				fastptr = fastptr.next.next;
				slowptr = slowptr.next;
				if(slowptr == fastptr) {
					return removeLoop(slowptr);
				}
			}
			return null;
	}
	
	public ListNode removeLoop(ListNode slowptr) {
		ListNode temp = head;
		while(slowptr.next != temp.next){
			temp = temp.next;
			slowptr = slowptr.next;
		}
		slowptr.next = null;
		return head;
	}
	public static void main (String args[]) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.head = new ListNode(2);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(8);
		ListNode fifth = new ListNode(6);
		ListNode sixth = new ListNode(5);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
//		sll.insertAtBeginning(1);
//		sll.insertAtEnd(10);
//		sll.insertAtPosition(2, 2);
//		sll.display();
//		System.out.println("The length of the Singly Linked List is " + sll.length());
//		sll.deleteFirst();
//		sll.display();
//		System.out.println("The length of the Singly Linked List is " + sll.length());
//		sll.deleteEnd();
//		sll.display();
//		System.out.println("The length of the Singly Linked List is " + sll.length());
//		sll.deleteAtPosition(2);
//		sll.display();
//		System.out.println("The length of the Singly Linked List is " + sll.length());
//		System.out.print(sll.searchLinkedList(4));
//		sll.reverseLinkedList();
//        System.out.println("Reversed List:");
//        sll.display();
//		System.out.print(sll.nthNodeFromLast(6).data);
//		System.out.print(sll.findMiddleNode().data);
//		sll.deleteDuplicateFromSortedLinkedList();
//		sll.display();
//		System.out.println("The length of the Singly Linked List is " + sll.length());
//		sll.insertNodeInSortedList(7);
//		sll.removeKeyFromLinkedList(10);
//		sll.display();
//		System.out.print(sll.detectStartOfLoopInASingleLinkedList().data);
		sll.removeLoopInASingleLinkedList();
		sll.display();
	}
}
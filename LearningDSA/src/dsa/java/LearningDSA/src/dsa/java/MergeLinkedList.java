package dsa.java;

public class MergeLinkedList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
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
	public static ListNode mergeLinkedList(ListNode a,ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while(a!=null &&b !=null) {
			if(a.data <= b.data) {
				tail.next = a;
				a = a.next;
			}
			else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if(a==null) {
			tail.next = b;
		}
		else {
			tail.next = a;
		}
		
		return dummy.next;
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
	public static ListNode addTwoLinkedList(ListNode a,ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		while(a!=null || b!=null) {
			int x = (a!=null)?a.data:0;
			int y = (b!=null)?b.data:0;
			int sum = carry+x+y;
			carry = sum/10;
			tail.next = new ListNode(sum%10);
			tail = tail.next;
			if(a!=null)a=a.next;
			if(b!=null)b=b.next;
		}
		if(carry>0) {
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeLinkedList mll1 = new MergeLinkedList();
		mll1.insertAtEnd(7);
		mll1.insertAtEnd(4);
		mll1.insertAtEnd(9);
		
		MergeLinkedList mll2 = new MergeLinkedList();
		mll2.insertAtEnd(5);
		mll2.insertAtEnd(6);
		mll1.display();
		mll2.display();
		MergeLinkedList result = new MergeLinkedList();
		result.head = addTwoLinkedList(mll1.head,mll2.head);
		
		result.display();
	}
	
	
}

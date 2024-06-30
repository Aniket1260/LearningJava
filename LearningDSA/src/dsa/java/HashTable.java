package dsa.java;

public class HashTable {
	private HashNode[] buckets;
	private int noOfBuckets;
	private int size;
	public HashTable(){
		this(10);
	}
	public HashTable(int capacity) {
		this.noOfBuckets = capacity;
		buckets = new HashNode[capacity];
		this.size = 0;
	}
	private class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		public HashNode(Integer key,String value) {
			this.key = key;
			this.value = value;
		}
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void put(Integer key,String value) {
		if(key == null || value == null ) {
			throw new IllegalArgumentException("Key or Value is Null");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = buckets[bucketIndex];
		HashNode node = new HashNode(key,value);
		node.next = head;
		buckets[bucketIndex] = node;
	}
	public String get(Integer key) {
		if(key == null ) {
			throw new IllegalArgumentException("Key is Null");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	public String remove(Integer key) {
		if(key == null ) {
			throw new IllegalArgumentException("Key is Null");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		HashNode previous = null;
		while(head!=null) {
			if(head.key.equals(key)) {
				break;
			}
			previous = head;
			head = head.next;
		}
		if(head == null)return null;
		size--;
		if(previous!=null)previous.next = head.next;
		else {
			buckets[bucketIndex] = head.next;
		}
		return head.value;
	}
	public Integer getBucketIndex(Integer key) {
		return key % buckets.length;
	}
	public static void main(String[] args) {
		HashTable table = new HashTable();
		table.put(12, "Akshay");
		table.put(3, "Aniket");
		System.out.print(table.size());
		System.out.print(table.get(3));
	}
}

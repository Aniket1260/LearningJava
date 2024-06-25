package dsa.java;

public class MaxPriorityQueue {
	private Integer[] heap;
	private int n;
	public MaxPriorityQueue(int capacity) {
		heap = new Integer[capacity+1];
		n=0;
	}
	public boolean isEmpty() {
		return n==0;
	}
	public int size() {
		return n;
	}
	public void insert(int x) {
		if(n == heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
	}
	public void swim(int k) {
		while(k>1 && heap[k/2]>heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k=k/2;
		}
	}
	public void resize(int capacity) {
		Integer[] temp = new Integer[capacity];
		for(int i =0;i<heap.length;i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}
	public void printMaxHeap() {
		for(int i = 1;i<=n;i++) {
			System.out.print(heap[i] + " ");
		}
	}
	public int deleteMax() {
		int max = heap[1];
		swap(1,n);
		n--;
		sink(1);
		heap[n+1] = null;
		if(n>1 && (n==(heap.length-1)/4)) {
			resize(heap.length/2);
		}
		return max;
	}
	public void sink(int k) {
		while(2*k<=n) {
			int j = 2*k;
			if(j<n && heap[j]<heap[j+1]) {
				j++;
			}
			if(heap[k]>heap[j]) {
				break;
			}
			swap(j,k);
			k=j;
		}
	}
	public void swap(int a,int b) {
		int temp = heap[a];
		heap [b] = heap[a];
		heap[b] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxPriorityQueue mpq = new MaxPriorityQueue(3);
		System.out.println(mpq.isEmpty());
		System.out.print(mpq.size());
		mpq.insert(4);
		mpq.insert(5);
		mpq.insert(6);
		mpq.insert(4);
		System.out.println();
		mpq.printMaxHeap();
		mpq.deleteMax();
		System.out.println();
		mpq.printMaxHeap();
	}

}

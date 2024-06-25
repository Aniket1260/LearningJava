package dsa.java;

public class LinearSearch {
	public int linearSearch(int[] arr,int n,int key) {
		for(int i =0;i<n;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,98,2,12,10,18};
		LinearSearch ls = new LinearSearch();
		System.out.print("Found at index "+ls.linearSearch(arr, arr.length, 12));
		
	}

}

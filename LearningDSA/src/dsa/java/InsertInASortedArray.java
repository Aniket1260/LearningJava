package dsa.java;

public class InsertInASortedArray {
	public int insertAtPostition(int [] arr,int target) {
		int low =0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low + high);
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid]>target) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertInASortedArray isr = new InsertInASortedArray();
		int[] nums = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
		System.out.print(isr.insertAtPostition(nums, 20));
		
	}

}

package dsa.java;

public class ReversingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,8,9,1};
//		for(int i =arr.length-1;i>=0;i--) {
//			System.out.print(arr[i] +" ");
//		}
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

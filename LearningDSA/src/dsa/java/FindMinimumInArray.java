package dsa.java;

public class FindMinimumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,1,7,8,9,6};
		int minimum = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] < minimum) {
				minimum = arr[i];
			}
		}
		System.out.print(minimum);
	}

}

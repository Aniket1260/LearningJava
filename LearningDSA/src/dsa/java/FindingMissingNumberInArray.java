package dsa.java;

public class FindingMissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7,8,9};
		int n = arr.length+1;
		int actual_sum = 0;
		int expected_sum = (n*(n+1))/2;
		for(int i = 0;i<arr.length;i++) {
			actual_sum += arr[i];
		}
		int missing_number = expected_sum-actual_sum;
		System.out.print(missing_number);
	}

}

package dsa.java;

public class MoveZeroesToTheLast {

	public static void main(String[] args) {
		int[] arr= {0,1,0,4,12,7,16,0,0,4,3,0,2,0};
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
package dsa.java;

public class RemovingEvenNumbersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,8,9,1};
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		int[] result = new int[count];
		int index = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[index]=arr[i];
				index++;
			}
			
		}
		for(int i = 0;i<result.length;i++) {
			System.out.print(result[i] + " ");
		}
	}

}

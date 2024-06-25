package dsa.java;

public class FindSecondMaximumvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,1,7,8,9,6};
		int maximum = Integer.MIN_VALUE;
		int second_maximum = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > maximum) {
				second_maximum = maximum;
				maximum = arr[i];
			}
			else if(arr[i] > second_maximum && arr[i]!=maximum) {
				second_maximum = arr[i];
			}
		}
		System.out.print(second_maximum);
		
	}

}

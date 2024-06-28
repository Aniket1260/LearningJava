package dsa.java;

public class ArrangeMaxMin {
	public void sort(int[] arr) {
		int maxIdx = arr.length -1;
		int minIdx = 0;
		int max = arr[maxIdx]+1;
		for(int i =0;i<arr.length;i++) {
			if(i%2==0) {
				arr[i] = arr[i] + (arr[maxIdx]%max)*max;
				maxIdx--;
			}
			else {
				arr[i] = arr[i] + (arr[minIdx]%max)*max;
				minIdx++;
			}
		}
		for(int i =0;i<arr.length;i++) {
			arr[i] = arr[i]/max;
		}
	}
	public void printArray(int[] arr) {
	      int n = arr.length;
	      for (int i = 0; i < n; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,6,8,9};
		ArrangeMaxMin amm = new ArrangeMaxMin();
		amm.printArray(arr);
		amm.sort(arr);
		amm.printArray(arr);
	}
}
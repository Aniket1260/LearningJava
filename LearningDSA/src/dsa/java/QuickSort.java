package dsa.java;

public class QuickSort {
	void sort(int arr[],int low,int high) {
		if(low<high) {
			int p = partition(arr,low,high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
		}
	}
	int partition(int arr[],int low,int high){
		int pivot = arr[high];
		int i = low;
		int j = low;
		while(i<=high) {
			if(arr[i]<=pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			i++;
		}
		return j-1;
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
		QuickSort qs = new QuickSort();
		int[] arr = new int[] { 5, 1, 2, 9, 10 };
		qs.printArray(arr);
		qs.sort(arr, 0, arr.length-1);
		qs.printArray(arr);
	}

}

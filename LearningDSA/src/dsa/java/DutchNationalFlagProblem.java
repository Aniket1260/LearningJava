package dsa.java;

public class DutchNationalFlagProblem {
	public void sort012(int arr[]) {
		int i = 0,j=0,k=arr.length-1;
		while(i<=k) {
			if(arr[i] == 0) {
				swap(arr,i,j);
				i++;
				j++;
			}
			else if(arr[i] == 1) {
				i++;
			}
			else if(arr[i] == 2) {
				swap(arr,i,k);
				k--;
			}
		}
		
	}

 public void printArray(int[] arr) {
	      int n = arr.length;
	      for (int i = 0; i < n; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	   }
	public void swap(int arr[],int first,int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DutchNationalFlagProblem st = new DutchNationalFlagProblem();
		 int[] arr = new int[] { 2, 0, 0, 1, 0, 2, 0, 1, 0, 2, 2, 0 };
		 st.printArray(arr);
	     st.sort012(arr);
	     st.printArray(arr);
	}

}

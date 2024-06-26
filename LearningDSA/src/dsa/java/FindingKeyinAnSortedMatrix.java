package dsa.java;

public class FindingKeyinAnSortedMatrix {
	public void findKey(int[][] matrix,int n,int key) {
		int i = 0;
		int j = n-1;
		while(i<n && j >=0) {
			if(matrix[i][j] == key) {
				System.out.println("Key Found AT " + +i + " , " + +j);
				return;
			}
			if(matrix[i][j]>key) {
				j--;
			}
			else{
				i++;
			}
		}
		System.out.println("Key Not Found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 51 } };
		 FindingKeyinAnSortedMatrix fk = new FindingKeyinAnSortedMatrix();
		 fk.findKey(matrix, matrix.length, 35);
	}

}

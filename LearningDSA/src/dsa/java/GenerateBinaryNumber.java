package dsa.java;
import java.util.Queue;
import java.util.LinkedList;

public class GenerateBinaryNumber {
	String[] generateBinaryNumber(int n) {
		String[] result = new String[n];
		Queue<String> q = new LinkedList<>();
		q.offer("1");
		for(int i = 0;i<n;i++) {
			result[i] = q.poll();
			String n1 = result[i] + "0";
			String n2 = result[i] + "1";
			q.offer(n1);
			q.offer(n2);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		GenerateBinaryNumber gnn = new GenerateBinaryNumber();
		String result[]=gnn.generateBinaryNumber(n);
		for(int i =0;i<n;i++) {
			System.out.print(result[i] + " ");
		}
	}

}

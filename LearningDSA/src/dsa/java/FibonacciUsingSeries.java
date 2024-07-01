package dsa.java;

public class FibonacciUsingSeries {
	public int fibonacci(int n) {
		int[] table = new int[n+1];
		table[0] = 0;
		table[1] = 1;
		for(int i = 2;i<table.length;i++) {
			table[i] = table[i-1] + table[i-2];
		}
		return table[n];
	}
	public int fibonacci(int[] memo,int n) {
		if(memo[n] == 0) {
		if(n < 2) {
			memo[n] = n;
		}
		else {
			int left = fibonacci(memo,n-1);
			int right = fibonacci(memo,n-2);
			memo[n] = left + right;
		}
		}
		return memo[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciUsingSeries f = new FibonacciUsingSeries();
		int result = f.fibonacci(new int[6+1],6);
		System.out.print(result);
	}

}

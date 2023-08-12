/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeAllEqualPairs {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] freq = new int[1001];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                freq[a[i]]++;
            }
            Arrays.sort(freq);
            System.out.println(n - freq[1000]);
        }
    }
}

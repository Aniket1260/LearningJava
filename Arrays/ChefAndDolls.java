/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndDolls {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int numb[] = new int[n];
            int freq[] = new int[100000];
            for (int i = 0; i < n; i++) {
                numb[i] = sc.nextInt();
                freq[numb[i]]++;
            }
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

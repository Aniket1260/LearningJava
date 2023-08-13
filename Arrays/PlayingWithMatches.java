/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PlayingWithMatches {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int numbers[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            int total = 0;
            String numbStr = Integer.toString(sum);
            int[] arr = new int[numbStr.length()];
            for (int i = 0; i < numbStr.length(); i++) {
                int digit = Character.getNumericValue(numbStr.charAt(i));
                arr[i] = numbers[digit];
                total += arr[i];
            }
            System.out.println(total);
        }
    }
}

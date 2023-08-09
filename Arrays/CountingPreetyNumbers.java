/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CountingPreetyNumbers {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int calc = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j <= b; j++) {
                if (j % 10 == 2) {
                    calc++;
                } else if (j % 10 == 9) {
                    calc++;
                } else if (j % 10 == 3) {
                    calc++;
                }
            }
            System.out.println(calc);
        }
    }
}

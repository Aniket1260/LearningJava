/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TheLeadGame {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int diff = 0;
        int lead = 0;
        int winner = 0;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                diff = a - b;
                if (diff > lead) {
                    lead = diff;
                    winner = 1;
                }
            } else {
                diff = b - a;
                if (diff > lead) {
                    lead = diff;
                    winner = 2;
                }
            }

        }
        System.out.print(winner + " " + lead);
    }
}

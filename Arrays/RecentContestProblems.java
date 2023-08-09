/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RecentContestProblems {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int st = 0;
            int lt = 0;
            int a = sc.nextInt();
            String b[] = new String[a];
            for (int j = 0; j < a; j++) {
                b[j] = sc.next();
            }
            for (int k = 0; k < a; k++) {
                if (b[k].equals("LTIME108")) {
                    st++;
                } else if (b[k].equals("START38")) {
                    lt++;
                }
            }
            System.out.println(lt + " " + st);

        }
    }
}

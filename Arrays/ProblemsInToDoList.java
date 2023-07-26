/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ProblemsinToDoList {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remove = 0;
        for (int i = 0; i < n; i++) {
            remove = 0;
            int num = sc.nextInt();
            int numbers[] = new int[num];
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = sc.nextInt();
                if (numbers[j] >= 1000) {
                    remove++;
                }
            }
            System.out.println(remove);
        }

    }
}

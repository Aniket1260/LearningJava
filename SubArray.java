import java.util.*;

class SubArray {
    public static void sub(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i + 1; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");

                }
                tp++;
                System.out.println();
            }

        }

        System.out.println("Total Pairs " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 4, 5, 7, 8, 10 };
        sub(numbers);
    }
}
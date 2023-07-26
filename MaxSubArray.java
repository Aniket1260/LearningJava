import java.util.*;

class MaxSubArray {
    public static void sub(int numbers[]) {
        int currentsum = 0;
        int maximumsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            currentsum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    currentsum += numbers[k];
                }
                System.out.println(currentsum);
                if (currentsum > maximumsum) {
                    maximumsum = currentsum;
                }
            }

        }

        System.out.println("Maximum sum " + maximumsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 4, 5, 7, 8, 10 };
        sub(numbers);
    }
}
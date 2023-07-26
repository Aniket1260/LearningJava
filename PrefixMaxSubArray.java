import java.util.*;

class PrefixMaxSubArray {
    public static void sub(int numbers[]) {
        int currentsum = 0;
        int maximumsum = Integer.MIN_VALUE;
        int[] prefix = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            currentsum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                int end = j;
                currentsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
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
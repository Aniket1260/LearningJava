import java.util.*;

class ReversingAnArray {
    public static void reversing(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        reversing(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
    }
}
import java.util.*;

class LargestNumberInAnArray {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = { 15, 16, 14, 2, 8, 6, 4, 20 };
        System.out.println("Largest number is " + getLargest(numbers));
        System.out.println("Smallest number is " + getSmallest(numbers));
    }
}
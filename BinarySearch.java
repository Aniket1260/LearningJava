import java.util.*;

class BinarySearch {
    public static int getIndex(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 5, 7, 8, 9, 14, 17, 18, 21 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int index = getIndex(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key Found at index " + index);
        }
    }
}
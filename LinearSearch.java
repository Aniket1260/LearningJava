import java.util.*;

class LinearSearch {
    public static int search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 8, 4, 5, 1, 2, 3, 6, 7 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at " + index);
        }
    }
}
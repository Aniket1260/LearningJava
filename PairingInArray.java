import java.util.*;

class PairinginArray {
    public static void Pairing(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 4, 5, 7, 8, 10 };
        Pairing(numbers);
    }
}
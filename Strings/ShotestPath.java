import java.util.*;

class ShortestPath {

    public static float displacedValue(String word1) {
        int x = 0, y = 0;
        for (int i = 0; i < word1.length(); i++) {
            char dir = word1.charAt(i);
            if (dir == 'N') {
                y++;
            }
            if (dir == 'S') {
                y--;
            }
            if (dir == 'E') {
                x++;
            }
            if (dir == 'W') {
                x--;
            }
        }
        float X2 = x * x;
        float Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        System.out.println(displacedValue(word1));
    }
}

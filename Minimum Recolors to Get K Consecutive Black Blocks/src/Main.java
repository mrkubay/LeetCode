//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
public class Main {
    public static void main(String[] args) {
        System.out.println(result("WBBWWBBWBW", 3));
        System.out.println(result("BWWWBB", 6));
        System.out.println(result("BWBBWWBBBWBWWWBWWBBWBWBBWBB", 11));
        System.out.println(result("WBBWWWWBBWWBBBBWWBBWWBBBWWBBBWWWBWBWW", 15));
    }

    private static int result(String blocks, int k) {
        char[] charArray = blocks.toCharArray();
        int currentResult = 0;

        for (int i = 0; i < k; i++) {
            if (charArray[i] == 'W') {
                currentResult++;
            }
        }
        int minResult = currentResult;
        for (int i = 1; i <= charArray.length-k; i++) {
            if (charArray[i-1] == 'W') {
                currentResult--;
            }
            if (charArray[i+k-1] == 'W') {
                currentResult++;
            }
            if (minResult > currentResult) {
                minResult = currentResult;
            }

        }

        return minResult;
    }
}
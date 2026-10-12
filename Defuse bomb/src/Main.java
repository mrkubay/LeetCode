import java.util.Arrays;

//https://leetcode.com/problems/defuse-the-bomb/description/
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(result(new int[]{5, 7, 1, 4}, 3))); // [12,10,16,13]
        System.out.println(Arrays.toString(result(new int[]{1, 2, 3, 4}, 0))); // [0,0,0,0]
        System.out.println(Arrays.toString(result(new int[]{2, 4, 9, 3}, -2))); // [12,5,6,13]
    }
//    0 - 2, 1 - 3, 2 - 0

    private static int[] result(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            return result;
        }

        int start = k > 0 ? 1 : n - Math.abs(k);
        int end = k > 0 ? k : n - 1;
        int currentSum = 0;
        for (int i = start; i <= end; i++) {
            currentSum += code[i % n];
        }
        for (int i = 0; i < n; i++) {
            result[i] = currentSum;
            currentSum -= code[start % n];
            currentSum += code[(end + 1) % n];

            start++;
            end++;
        }
        return result;
    }
}
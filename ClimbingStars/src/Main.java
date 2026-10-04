//https://leetcode.com/problems/climbing-stairs/
public class Main {
    public static void main(String[] args) {
        System.out.println(result(6));
    }

    private static int result(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] result = new int[n + 1];
        result[0] = result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }

        return result[n];

    }
    /*
    [1]
    1
    [2]
     1 1
     2
    [3]
     1 1 1
     1 2
     2 1
    [4]
     1 1 1 1
     2 2
     2 1 1
     1 1 2
     1 2 1
     [5]
     1 1 1 1 1
     2 1 1 1
     1 2 1 1
     1 1 2 1
     1 1 1 2
     2 2 1
     2 1 2
     1 2 2
     */
}
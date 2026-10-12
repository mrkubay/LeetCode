//https://leetcode.com/problems/maximum-average-subarray-i/description/
public class Main {
    public static void main(String[] args) {
        System.out.println(result(new int[] {1,12,-5,-6,50,3}, 4));
        System.out.println(result(new int[] {5}, 1));
    }

    private static double result(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i-k] + nums[i];
            if(currentSum> maxSum) {
                maxSum = currentSum;
            }
        }
        return (double) maxSum / k;

    }
}
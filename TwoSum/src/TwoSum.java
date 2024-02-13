/*
https://leetcode.com/problems/two-sum/description/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
public class TwoSum {

    public static void main(String[] args) {
        int[] result1 = twoSum(new int[]{2,7,11,15}, 9);
        int[] result2 = twoSum(new int[]{3,2,4}, 6);
        int[] result3 = twoSum(new int[]{3,3}, 6);
        displayArray(result1);
        displayArray(result2);
        displayArray(result3);
    }

    private static int[] twoSum (int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] + nums[i+1] == target) {
                return new int[] {i, i+1};
            }
        }
        return new int[0];
    }

    private static void displayArray(int [] result) {
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i != result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}

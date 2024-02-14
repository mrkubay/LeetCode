import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/two-sum/description/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
public class TwoSum {

    public static void main(String[] args) {
        int[] result1 = twoSumMap(new int[]{2, 11, 15, 7}, 9);
        int[] result2 = twoSumMap(new int[]{3, 2, 3}, 6);
        int[] result3 = twoSumMap(new int[]{3, 3}, 6);
        displayArray(result1);
        displayArray(result2);
        displayArray(result3);
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    private static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> integers = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            int value = target - nums[i];
            if (integers.containsKey(value) ) {
                return new int[]{integers.get(value), i};
            }
            integers.put(nums[i], i);
        }
        return new int[]{};
    }

    private static void displayArray(int[] result) {
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}

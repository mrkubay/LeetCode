/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
* 26. Remove Duplicates from Sorted Array
* */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 2, 3, 3, 4, 5, 5, 5, 6, 7, 7, 7, 8, 8, 8, 8}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{1, 2, 3}));
        System.out.println(removeDuplicates(new int[]{1, 1, 1}));
        System.out.println(removeDuplicates(new int[]{}));

    }

    private static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0 ) {return 0;}
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j-1] < nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int h = j; h < nums.length; h++) {
            nums[h] = 101; // value away from possible diapason -100 <= nums[i] <= 100
        }
        return j;
    }

    private static int removeDuplicatesMyFirstVariant(int[] nums) {
        int countOfIntMaxs = 0;
        LinkedList<Integer> expectedNums = new LinkedList<>();
        expectedNums.add(nums[0]);
        for (int i = 1; i< nums.length;i++) {
            if (nums[i] > expectedNums.getLast()) {
                expectedNums.addLast(nums[i]);
            } else {
                countOfIntMaxs++;
            }
        }
        int k =  expectedNums.size();
        for (int j = 0; j < countOfIntMaxs; j++ ) {
            expectedNums.addLast(101);
        }
        return  k;
    }

    private static int removeDuplicates1(int[] nums) {
        int[] expectedNums = new int[nums.length];
        expectedNums[0] = nums[0];
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (expectedNums[j - 1] < nums[i]) {
                expectedNums[j] = nums[i];
                j++;
            }
        }
        for (int h = expectedNums.length - 1; h >= j; h--) {
            expectedNums[h] = 101; // value away from possible diapason -100 <= nums[i] <= 100
        }
        return j;
    }
}
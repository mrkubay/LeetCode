import java.util.HashMap;

//https://leetcode.com/problems/contains-duplicate/description/
public class Main {
    public static void main(String[] args) {
        System.out.println(result(new int[]{1, 2, 3, 1}));
        System.out.println(result(new int[]{1, 2, 3, 4}));
        System.out.println(result(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    private static boolean result(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i])) {
//                numMap.put(nums[i], numMap.get(nums[i]) + 1);
                return true; // or even return isDuplicate=true here on finding the first duplicate
            } else {
                numMap.put(nums[i], 1);
            }
        }
        return numMap.values().stream().anyMatch(v -> v > 1);
    }
}
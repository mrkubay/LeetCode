import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/description/
public class Main {
    public static void main(String[] args) {
        System.out.println(result2(new int[]{1, 2, 3, 1}));
        System.out.println(result2(new int[]{1, 2, 3, 4}));
        System.out.println(result2(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
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

    private static boolean result2(int[] nums) {
        HashSet<Integer> numMap = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
           if (!numMap.add(nums[i])) {
               return true;
           }
        }
        return false;
    }
}
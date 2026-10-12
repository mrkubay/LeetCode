import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate-ii/description/
public class Main {
    public static void main(String[] args) {
        System.out.println(result(new int[] {1,2,3,1}, 3));
        System.out.println(result(new int[] {1,0,1,1}, 1));
        System.out.println(result(new int[] {1,2,3,1,2,3}, 2));
    }

    private static boolean result(int[] nums, int k) {
        HashMap<Integer, Integer> valueAndItsIndex = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (valueAndItsIndex.containsKey(nums[i])) {
                if (Math.abs(valueAndItsIndex.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    valueAndItsIndex.put(nums[i], i);
                }
            } else {
                valueAndItsIndex.put(nums[i], i);
            }
        }
        return false;
    }

//    sliding window hashSet
    private static boolean result2(int[] nums, int k) {
        Set<Integer> window = new HashSet<>(k);
        for (int i = 0; i < nums.length; i++) {
            if(!window.add(nums[i])) {
                return true;
            }
            if(i>=k) {
                window.remove(nums[i-k]);
            }
        }
        return false;
    }

}
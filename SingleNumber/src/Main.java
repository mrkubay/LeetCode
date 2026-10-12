import java.util.HashSet;

//https://leetcode.com/problems/single-number/description/
public class Main {
    public static void main(String[] args) {
        System.out.println(result2(new int[]{2, 2, 1}));
        System.out.println(result2(new int[]{4, 1, 2, 1, 2}));
        System.out.println(result2(new int[]{1}));
    }

    private static int result(int[] nums) {
        HashSet<Integer> uniqueInts = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (uniqueInts.contains(nums[i])) {
                uniqueInts.remove(nums[i]);
            } else {
                uniqueInts.add(nums[i]);
            }
        }
        return uniqueInts.stream().reduce(0, (curr, next) -> curr + next);
    }

    //    Using XOR operator
    private static int result2(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
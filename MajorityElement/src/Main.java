import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/
public class Main {
    public static void main(String[] args) {
        System.out.println(result(new int[] {3,2,3}));
        System.out.println(result(new int[] {2,2,1,1,1,2,2}));
    }

    private static int result(int[] nums) {
        HashMap<Integer, Integer> numberAndItsReps = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (numberAndItsReps.containsKey(nums[i])) {
                numberAndItsReps.put(nums[i], numberAndItsReps.get(nums[i]) + 1);
            } else {
                numberAndItsReps.put(nums[i], 1);
            }
        }
        return numberAndItsReps.entrySet()
                .stream()
                .filter(entry -> entry.getValue().intValue() > nums.length / 2)
                .findAny()
                .map(Map.Entry::getKey)
                .get();
    }
}
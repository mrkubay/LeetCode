import java.util.Arrays;
import java.util.stream.Collectors;

//https://leetcode.com/problems/move-zeroes/description/
public class Main {
    public static void main(String[] args) {
        result(new int[]{0, 1, 0, 3, 12});
        result(new int[]{0});
        result(new int[]{1, 0, 1});
    }

    //[1 0 1]
//       l r
    private static void result(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                if (left != right) {
                    nums[left] = nums[right];
                    nums[right] = 0;
                }
                left++;
            }
        }

        System.out.println(Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.toList()));
    }
}
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(result(new int[] {1, 2 , 3}));
    }

    private static int result(int[] nums) {
       int potentialSumm = potentialSummOf(nums.length);
       int actualSumm = IntStream.of(nums).reduce(0 , Integer::sum);
       return potentialSumm - actualSumm;

    }
    private static int potentialSummOf(int arrLength) {
        int sum = 0;
        int index = 0;
        while (index <= arrLength) {
            sum += index;
            index++;
        }
        return sum;
    }
}
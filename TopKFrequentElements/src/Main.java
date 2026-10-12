import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        IntStream.of(result(new int[]{1, 1, 1, 2, 2, 3}, 2)).forEach(elem -> System.out.print(elem + " "));
//        System.out.println();
//        IntStream.of(result(new int[]{1}, 1)).forEach(elem -> System.out.print(elem + " "));
//        System.out.println();
        int[] result = result2(new int[]{1, 2, 1, 2, 1, 2, 3, 1, 3, 2}, 2);
        IntStream.of(result).forEach(elem -> System.out.print(elem + " "));
        System.out.println();

    }

    private static int[] result(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (frequency.containsKey(nums[i])) {
                frequency.put(nums[i], frequency.get(nums[i]) + 1);
            } else {
                frequency.put(nums[i], 1);
            }
        }

        TreeMap<Integer, Integer> result = new TreeMap<>((Integer int1, Integer int2) -> int2.compareTo(int1));
        frequency.forEach((key, value) -> result.put(value, key));


        return result
                .entrySet()
                .stream()
                .limit(k)
                .mapToInt(Map.Entry::getValue)
                .toArray();

    }

    private static int[] result2(int[] nums, int k) {
        // 1. Рахуємо частоту кожного числа
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 2. Створюємо список кишень (List<List<Integer>>)
        // Індекс кишені відповідає частоті. Розмір = nums.length + 1
        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        // Розподіляємо числа по кишенях
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int freq = entry.getValue();
            int num = entry.getKey();
            buckets.get(freq).add(num);
        }

        // 3. Збираємо k найчастіших елементів, рухаючись з кінця (від найбільших частот)
        int[] result = new int[k];
        int index = 0;
        for (int i = buckets.size() - 1; i >= 0 && index < k; i--) {
            List<Integer> currentBucket = buckets.get(i);
            for (int num : currentBucket) {
                result[index++] = num;
                if (index == k) {
                    break;
                }
            }
        }

        return result;
    }
    }
}
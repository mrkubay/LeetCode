import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1210));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1));

    }

    private static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x <= 9) return true;

        List<Integer> result = new ArrayList<>();
        while (x != 0) {
            result.add(x % 10);
            x = x / 10;
        }
        Integer[] array = result.toArray(Integer[]::new);
        for (int i = 0; i < array.length / 2; i++) {
            if (!array[i].equals(array[array.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }
}
import java.util.ArrayList;

/*
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * 21. Merge Two Sorted Lists
 * */
public class Main {
    public static void main(String[] args) {
        int[] array2 = new int[]{6, 8, 13, 15};
        int[] array1 = new int[]{9, 11, 13};
        ArrayList<Integer> result = newMethod(array1, array2);
        System.out.println(result);

    }


    private static ArrayList<Integer> newMethod(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<>(array1.length + array2.length);
        int index1 = 0;
        int index2 = 0;
        while (index1 < array1.length && index2 < array2.length) {
            if (array1[index1] <= array2[index2]) {
                result.add(array1[index1]);
                index1++;
            } else {
                result.add(array2[index2]);
                index2++;
            }
        }
        while (index1 < array1.length) {
            result.add(array1[index1]);
            index1++;
        }
        while (index2 < array2.length) {
            result.add(array2[index2]);
            index2++;
        }


        return result;
    }
}
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * 21. Merge Two Sorted Lists
 * */
public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{6, 8, 13, 15};
        int[] array2 = new int[]{9, 11, 13};
        LinkedList<ListNode> resultList = new LinkedList<>();
        List<ListNode> listNodes1 = convertToListNodeArr(array1);
        List<ListNode> listNodes2 = convertToListNodeArr(array2);
        for (int i = 0; i < getBiggerArray(listNodes1, listNodes2).size(); i++) {
            System.out.println("i"+ i);
            if (listNodes2.get(i) != null) {
                resultList.add(mergeTwoLists(listNodes1.get(i), listNodes2.get(i)));
            } else {
                resultList.add(listNodes1.get(i));
            }
        }
        System.out.println(resultList);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null) {
            return list2;
        } else {
            return list1;
        }
    }

    private static List<ListNode> getBiggerArray(List<ListNode> array1, List<ListNode> array2) {
        return array1.size() > array2.size() ? array1 : array2;
    }

    private static List<ListNode> convertToListNodeArr(int[] array) {
        ArrayList<ListNode> result = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            ListNode listNode = new ListNode(array[i], new ListNode(array[i+1]));
            result.add(listNode);
        }
        return result;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
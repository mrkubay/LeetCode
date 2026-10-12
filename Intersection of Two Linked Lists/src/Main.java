import java.util.HashSet;

//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static ListNode result(ListNode headA, ListNode headB) {
        HashSet<ListNode> knownNodesA = new HashSet<>();
        ListNode currentA = headA;
        while (currentA != null) {
            knownNodesA.add(currentA);
            currentA = currentA.next;
        }

        ListNode currentB = headB;
        while (currentB != null) {
            if (knownNodesA.contains(currentB)) {
                return currentB;
            }
            currentB = currentB.next;
        }
        return null;
    }

}
import java.util.HashSet;

//https://leetcode.com/problems/linked-list-cycle/description/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private boolean result(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<>();
        ListNode current = head;
        while (current != null && current.next != null) {
            if (visitedNodes.contains(current)) {
                return true;
            } else {
                visitedNodes.add(current);
            }
            current = current.next;
        }
        return false;
    }

    private boolean result2 (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}

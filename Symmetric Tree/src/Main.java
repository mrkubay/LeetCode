
//https://leetcode.com/problems/symmetric-tree/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if(n1 == null || n2 == null) {
            return false;
        }
        return n1.val == n2.val && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);

    }

//    13 24 37 41 50 84 96 98
}
//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode current = root;
        return 1 + Math.max(maxDepth(current.left), maxDepth(current.right));

    }

}
//https://leetcode.com/problems/invert-binary-tree/description/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode current = root;
        TreeNode temp = current.right;
        current.right = current.left;
        current.left = temp;

        invertTree(current.left);
        invertTree(current.right);

        return root;

    }


}
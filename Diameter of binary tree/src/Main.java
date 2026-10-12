//https://leetcode.com/problems/diameter-of-binary-tree/description/
public class Main {
    int res = 0;
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static int result(TreeNode root) {

    }
    private static int dfs(TreeNode current) {
        if (current == null) {
            return 0;
        }
        int l = dfs(current.left);
        int r = dfs(current.right);

        res = Math.max(res, l + r);

        return 1 + Math.max(l, r);
    }
}
package _20200213;

/**
 * @author yuanyiwen
 * @create 2020-02-13 15:37
 * @description 98.验证二叉搜索树 https://leetcode-cn.com/problems/validate-binary-search-tree/submissions/
 */
public class Sooolution {
    /**
     * 二叉搜索树的中序遍历是有序的！
     */
    double last = -Double.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (isValidBST(root.left)) {
            if (last < root.val) {
                last = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}
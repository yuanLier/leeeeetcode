package _20200222;

/**
 * @author yuanyiwen
 * @create 2020-02-22 10:08
 * @description 树的子结构
 *      题目描述 ：
 *          输入两棵二叉树A，B，判断B是不是A的子结构。
 *          （ps：我们约定空树不是任意一个树的子结构）
 */
public class Sooolution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        // 若其中一颗树为空，则直接返回false
        if(root2 == null || root1 == null) {
            return false;
        }
        // 若找到了某一相同的根节点，且它满足Tree2是否为Tree1的子结构，返回true
        if(root1.val == root2.val && doesTree1HaveTree2(root1, root2)){
            return true;
        }
        // 否则，尝试以Tree1当前节点的左右儿子作为根节点，递归寻找
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    // 判断Tree2是否为Tree1的子结构
    public boolean doesTree1HaveTree2(TreeNode node1, TreeNode node2) {
        // 如果Tree2已经遍历完了都能对应上，返回true
        if (node2 == null) {
            return true;
        }
        // 如果Tree2还没有遍历完，Tree1却遍历完了，或是其中存在某个节点无法对应上，返回false
        if (node1 == null || node1.val != node2.val) {
            return false;
        }
        // 如果根节点对应的上，就再分别去子节点里匹配
        return doesTree1HaveTree2(node1.left, node2.left) && doesTree1HaveTree2(node1.right, node2.right);
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
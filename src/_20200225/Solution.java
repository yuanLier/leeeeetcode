package _20200225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yuanyiwen
 * @create 2020-02-25 10:14
 * @description 二叉树的镜像
 *      题目描述 ：
 *          操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Solution {
    /**
     * 递归
     */
    public void Mirror1(TreeNode root) {
        if(root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror1(root.left);
        Mirror1(root.right);
    }

    /**
     * 非递归（其实就是在非递归遍历的基础上加上了交换左右节点
     * @param root
     */
    public void Mirror2(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> nodes = new LinkedList<>();
        TreeNode curr, temp;
        nodes.offer(root);
        while(!nodes.isEmpty()) {
            int len = nodes.size();
            for(int i = 0; i < len; i++) {
                curr = nodes.poll();
                temp = curr.left;
                curr.left = curr.right;
                curr.right = temp;
                if(curr.left != null) nodes.offer(curr.left);
                if(curr.right != null) nodes.offer(curr.right);
            }
        }
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
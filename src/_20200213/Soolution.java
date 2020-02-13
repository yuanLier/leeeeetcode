package _20200213;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author yuanyiwen
 * @create 2020-02-13 14:52
 * @description 94.二叉树中的中序遍历 https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class Soolution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
package _20200219;

import java.util.Arrays;

/**
 * @author yuanyiwen
 * @create 2020-02-19 10:19
 * @description 重建二叉树
 *      题目描述 ：
 *          输入某二叉树的前序遍历和中序遍历的结果，
 *          请重建出该二叉树。
 *          假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *          例如输入
 *          前序遍历序列{1,2,4,7,3,5,6,8}，
 *          中序遍历序列{4,7,2,1,5,3,8,6}，
 *          则重建二叉树并返回。
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //递归调用的终止条件
        if(pre.length == 0){
            return null;
        }
        //由前序遍历得到该二叉树的根结点
        TreeNode root = new TreeNode(pre[0]);
        //在中序遍历中找根结点位置，进行左右子树的划分
        for(int i = 0; i < in.length; i++){
            if(root.val == in[i]) {
                //将左子树看成一棵二叉树调用该方法，可以得到左子树根结点，即上面根结点的左子结点
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                //将右子树看成一棵二叉树调用该方法，可以得到右子树根结点，即上面根结点的右子结点
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
                //找到根结点位置便跳出循环
                break;
            }
        }
        //返回根结点
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
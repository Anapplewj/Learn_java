package Pra0317;
//判断一棵二叉树是否为平衡二叉树
//平衡二叉树左右子树的高度差的绝对值不大于1

public class Solution7 {
    public int deep(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=deep(root.left);
        int right=deep(root.right);
        return 1+(left>right?left:right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(deep(root.left)-deep(root.right)>1||
        deep(root.left)-deep(root.right)<-1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
}

package Pra0318;
//判断一棵二叉树是否为平衡二叉树
//平衡二叉树首先它的左右子树得高度差得绝对值不大于一
//求出左右子树得高度，找反例，如果找到就返回false
public class Solution1 {
    public int deep(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDeep=deep(root.left);
        int rightDeep=deep(root.right);
        return 1+(leftDeep>rightDeep?leftDeep:rightDeep);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int left=deep(root.left);
        int right=deep(root.right);
        if(left-right>1||left-right<-1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
}

package Pra0317;
//判断一棵二叉树是否为对称二叉树
//对称二叉树的左子树等于右子树

public class Solution8 {
    //判断左右子树是否为镜像
    public boolean isMirro(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        if(s.val!=t.val){
            return false;
        }
        return isMirro(s.left,t.right)&&isMirro(s.right,t.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirro(root.left,root.right);
    }
}

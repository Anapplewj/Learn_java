package Pra0318;
//判断一棵二叉树是否为对称二叉树
//二叉树得左子树和右子树相同
public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirro(root.left,root.right);
    }
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
}

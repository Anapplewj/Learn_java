package Pra0317;
//判断一棵二叉树是否为另一棵的子树
public class Solution5 {
    public boolean isSametree(TreeNode p, TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSametree(p.left,q.left)&& isSametree(p.right,q.right);
    }
    public boolean isSubtree(TreeNode s,TreeNode t){
        if(s==null){
            return false;
        }
        boolean ret= isSametree(s,t);
        if(ret){
            return true;
        }
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
}

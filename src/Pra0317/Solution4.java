package Pra0317;
//检查两棵二叉树是否相同
public class Solution4 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //两棵树都为空
        if(p==null&&q==null){
            return true;
        }
        //两棵树其中一颗树为空，一棵树不为空
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}

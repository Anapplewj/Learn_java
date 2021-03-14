package Pra0314;
//检查两棵树是否相同
//将两个树遍历，看是否相同
public class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //两个树都是空
        if(p==null&&q==null){
            return true;
        }
        //两个树其中一个为空，另一个不为空
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}

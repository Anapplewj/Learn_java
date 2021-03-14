package Pra0314;
//检查t是否为s的子树
//首先给定一个根节点，然后判断从此节点两个数是否相同
public class Solution3 {
    public boolean isSametree(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        if(s.val!=t.val){
            return false;
        }
        return isSametree(s.left,t.left)&&isSametree(s.right,t.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
            return false;
        }
        boolean ret=isSametree(s,t);
        if(ret){
            return true;
        }
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
}

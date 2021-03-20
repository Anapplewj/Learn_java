package Pra0320;
//找到两个节点的公共祖先
//三种情况满足两个就可以认为是公共祖先了
//层序遍历树
public class Solution4 {
    public static TreeNode result=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        find(root,p,q);
        return result;
    }
    public static boolean find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return false;
        }
        int result1=(root==p||root==q)?1:0;
        int result2=find(root.left,p,q)?1:0;
        int result3=find(root.right,p,q)?1:0;
        if(result1+result2+result3==2){
            result=root;
        }
        return (result1+result2+result3)>0;
    }
}

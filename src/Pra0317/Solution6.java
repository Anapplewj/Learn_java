package Pra0317;
//二叉树的最大深度
public class Solution6 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+(left>right?left:right);
    }
}

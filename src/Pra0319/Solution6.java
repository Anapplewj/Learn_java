package Pra0319;

import java.util.ArrayList;
import java.util.List;

//根据中序遍历和后序遍历的结果，构建出一棵二叉树
public class Solution6 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    //由于是后续遍历，所以左右根的去遍历
    public static int index=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=postorder.length-1;
        TreeNode root=_build(inorder,postorder,0,inorder.length);
        return root;
    }
    public static TreeNode _build(int[] inorder,int[] postorder,int inorderLeft,int inorderRight){
        if(index<0){
            return null;
        }
        if(inorderLeft>=inorderRight){
            return null;
        }
        TreeNode root=new TreeNode(postorder[index]);
        index--;
        int pos=find(root,inorder,inorderLeft,inorderRight);
        root.right=_build(inorder,postorder,pos+1,inorderRight);
        root.left=_build(inorder,postorder,inorderLeft,pos);
        return root;
    }
    public static int find(TreeNode root,int[] inorder,int inorderLeft,int inorderRight){
        for(int i=inorderLeft;i<inorderRight;i++){
            if(inorder[i]==root.val){
                return i;
            }
        }
        return -1;
    }
}

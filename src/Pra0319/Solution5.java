package Pra0319;

import java.util.ArrayList;
import java.util.List;

//根据先序遍历和中序遍历构建二叉树,方法2
public class Solution5 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index=0;
        List<Integer> list=new ArrayList<>();
        for(int x:inorder){
            list.add(x);
        }
        TreeNode root=_build(preorder,list);
        return root;
    }
    public static TreeNode _build(int[] preorder,List<Integer> list){
        if(list.isEmpty()){
            return null;
        }
        if(index>=preorder.length){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index]);
        index++;
        int pos=list.indexOf(root.val);
        root.left=_build(preorder,list.subList(0,pos));
        root.right=_build(preorder,list.subList(pos+1,list.size()));
        return root;
    }
}

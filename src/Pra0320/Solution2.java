package Pra0320;

import java.util.ArrayList;
import java.util.List;

//从前序与中序遍历构建二叉树
//首先创建一个成员变量index，记录在先序遍历中的位置
//中序遍历可以得到根节点的中序遍历的区间
public class Solution2 {
    public static int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index=0;
        List<Integer> list=new ArrayList<>();
        for(int x:inorder){
            list.add(x);
        }
        TreeNode root=build(preorder,list);
        return root;
    }
    public static TreeNode build(int[] preorder,List<Integer> inorder){
        //先序遍历已经完成了
        if(index>=preorder.length){
            return null;
        }
        //中序遍历的区间为空
        if(inorder.isEmpty()){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index]);
        index++;
        int pos=inorder.indexOf(root.val);
        root.left=build(preorder,inorder.subList(0,pos));
        root.right=build(preorder,inorder.subList(pos+1,inorder.size()));
        return root;
    }
    //从中序遍历和后序遍历构建出二叉树
    //和上面的换汤不换药
    //顺序变成了根右左
    public static int index1=0;
    public TreeNode _buildTree(int[] inorder, int[] postorder) {
        index1=postorder.length-1;
        List<Integer> list=new ArrayList<>();
        for(int x:inorder){
            list.add(x);
        }
        TreeNode root=_build(postorder,list);
        return root;
    }
    public static TreeNode _build(int[] postorder,List<Integer> inorder){
        if(index<0){
            return null;
        }
        if(inorder.isEmpty()){
            return null;
        }
        TreeNode root=new TreeNode(postorder[index]);
        index--;
        int pos=inorder.indexOf(root.val);
        root.right=_build(postorder,inorder.subList(pos+1,inorder.size()));
        root.left=_build(postorder,inorder.subList(0,pos));
        return root;
    }
}

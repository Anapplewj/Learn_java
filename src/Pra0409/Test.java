package Pra0409;

import java.util.*;

//判断一个序列是否为搜索二叉树的后序遍历的结果
public class Test {
    public boolean VerifySquenceOfBST(int [] sequence) {
        return _healp(sequence,0,sequence.length-1);
    }
    private boolean _healp(int[] sequence, int left, int right){
        if(left>=right){
            return true;
        }
        int v=sequence[right];
        int p=left;
        while(sequence[p]<v){
            p++;
        }
        int m=p;
        while(sequence[p]>v){
            p++;
        }
        return p==right&& _healp(sequence,left,m-1)&& _healp(sequence,m,right-1);
    }
    //打印出来值为target的路径
    //实际上在遍历的时候,如果比target大了,也就没必要再继续找了
    public static ArrayList<ArrayList<Integer>> list=null;
    public static ArrayList<Integer> path=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        list=new ArrayList<>();
        if(root==null){
            return list;
        }
        _healp(root,target);
        return list;
    }
    private void _healp(TreeNode root,int target){
        if(root==null){
            return;
        }
        if(path==null){
            path=new ArrayList<>();
        }
        path.add(root.val);
        target-=root.val;
        if(target==0 && root.left==null && root.right==null){
            list.add(new ArrayList<>(path));
            path=null;
        }
        _healp(root.left,target);
        _healp(root.right,target);
        path.remove(path.size()-1);
    }
    static class RandomListNode{
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null){
            return null;
        }
        Map<RandomListNode,RandomListNode> map=new HashMap<>();
        for(RandomListNode cur=pHead;cur!=null;cur=cur.next){
            RandomListNode newNode=new RandomListNode(cur.label);
            map.put(cur,newNode);
        }
        for(RandomListNode node:map.keySet()){
            map.get(node).next=map.get(node.next);
            map.get(node).random=map.get(node.random);
        }
        return map.get(pHead);
    }
    //将一颗二叉树调整成为一个双向链表
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        if(pRootOfTree.left==null && pRootOfTree.right==null){
            return pRootOfTree;
        }
        //将二叉树的left看作是prev,right看作是next
        //首先将左子树转化为一个双向链表
        TreeNode leftHead = Convert(pRootOfTree.left);
        TreeNode leftTail = leftHead;
        while (leftTail!=null&&leftTail.right!=null){
            leftTail=leftTail.right;
        }
        //将根节点拼接
        if(leftHead!=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        //再将右子树转化为一个双向链表
        TreeNode rightHead=Convert(pRootOfTree.right);
        if(rightHead!=null){
            pRootOfTree.right=rightHead;
            rightHead.left=pRootOfTree;
        }
        return leftHead==null?pRootOfTree:leftHead;
    }
}

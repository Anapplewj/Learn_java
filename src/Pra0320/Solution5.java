package Pra0320;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//二叉树的层序遍历
//题目不同，使用的方法也不同
//借助队列来实现
//烦死了。。。二叉树的题目好难呀
public class Solution5 {
    public static List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        list=new ArrayList<>();
        if(root==null){
            return list;
        }
        helper(root,0);
        return list;
    }
    public void helper(TreeNode root,int level){
        if(list.size()==level){
            list.add(new ArrayList<>());
        }
        //先序遍历
        list.get(level).add(root.val);
        if(root.left!=null) {
            helper(root.left, level + 1);
        }
        if(root.right!=null) {
            helper(root.right, level + 1);
        }
    }
    //二叉树的层序遍历
    //借助队列来实现,不需要使用递归的方法
    Queue<TreeNode> queue=new LinkedList<>();
    public void levelOrderTraversal(TreeNode root){
        queue=new LinkedList<>();
        queue.offer(root);
        while(true){
            TreeNode cur=queue.poll();
            if(cur==null){
                break;
            }
            System.out.print(cur.val);
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }

    }
}

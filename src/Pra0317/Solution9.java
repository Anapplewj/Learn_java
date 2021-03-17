package Pra0317;

import java.util.LinkedList;
import java.util.Queue;

//二叉树的层序遍历
//将二叉树的节点按照先序遍历的顺序放入一个队列中
//放入后，再取出来，将其左右子节点放入，再取出来，插入..，
//直到队列为空
//这个题目没有使用递归，用到的是循环
public class Solution9 {
    public void levelOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(true){
            TreeNode cur=queue.poll();
            if(cur==null){
                break;
            }
            System.out.print(cur.val);
            if (cur.left!=null) {
                queue.offer(cur.left);
            }
            if (cur.right!=null) {
                queue.offer(cur.right);
            }
        }
    }
}

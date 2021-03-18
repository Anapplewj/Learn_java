package Pra0318;

import java.util.LinkedList;
import java.util.Queue;

//二叉树的层序遍历
//借助队列来完成
//将根节点插入队列，再取出来访问，如果它有左子树，将其插入队列，再将
//右子树插入队列，循环往复，直到队列为空
public class Solution3 {
    void levelOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(true){
            TreeNode cur=queue.poll();//将队首元素取出来
            if(cur==null){
                break;
            }
            System.out.print(root.val);//访问队首元素
            if(root.left!=null){
                queue.offer(cur.left);
            }
            if(root.right!=null){
                queue.offer(cur.right);
            }
        }
    }
}

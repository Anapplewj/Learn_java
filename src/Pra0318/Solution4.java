package Pra0318;

import java.util.LinkedList;
import java.util.Queue;

//判断一棵二叉树是否为完全二叉树
//思路：借助层序遍历来完成，分为两个阶段
//是用一个标记来记录当前的阶段
//第一阶段为初步的判断，第二阶段，从当前结点开始，如果还能找到
//子树，那么就说明不为完全二叉树
public class Solution4 {
    boolean isCompleteTree(TreeNode root){
        if(root==null){
            return true;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean level2=false;
        while(true){
            TreeNode cur=queue.poll();
            if(cur==null){
                break;
            }
            if(!level2){
                if(cur.left!=null&&cur.right!=null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                    level2=true;
                }else if(cur.left==null&&cur.right!=null){
                    return false;
                }else if(cur.left!=null&&cur.right==null){
                    queue.offer(cur.left);
                    level2=true;
                }else{
                    level2=true;
                }
            }else{
                if(cur.left!=null||cur.right!=null){
                    return false;
                }
            }
        }//end while
        return true;
    }
}

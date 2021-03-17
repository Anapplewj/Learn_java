package Pra0317;

import java.util.LinkedList;
import java.util.Queue;

//判断一棵二叉树是否为完全二叉树，对其进行层序遍历
//分为两个阶段，第一阶段:如果它的左子树和右子树均不为空，那么进入第二阶段
//如果它的左子树为空，右子树不为空，那么直接返回false
//如果它的左子树不为空，右子树为空，进入第二阶段
//如果它的左子树为空，右子树为空，那继续进入第二阶段
//第二阶段：从当前节点遍历完一直没有子树，才是完全二叉树
public class Solution10 {
    public boolean isCompleteTree(TreeNode root){
        if(root==null){
            return true;
        }
        //借助层序遍历来实现
        //定义一个变量level1，表示当前所在的阶段
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean level2=false;
        while(true){
            TreeNode cur=queue.poll();
            if(cur==null){
                break;
            }
            if (!level2) {
                if(cur.left!=null&&cur.right!=null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                    level2=true;
                }else if(cur.left!=null&&cur.right==null){
                    queue.offer(cur.left);
                    level2=true;
                }else if(cur.left==null&&cur.right!=null){
                    return false;
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

package Pra0327;

import java.util.Stack;

public class Order {
    //非递归实现二叉树的先序遍历
    //创建一个栈，根左右，栈是后进先出，所以是根右左的方式入栈
    public static void prevOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            if(cur==null){
                break;
            }
            //访问根节点
            System.out.print(cur.val+" ");
            //将树的右子树入栈
            if(cur.right!=null){
                stack.push(cur.right);
            }
            //将树的左子树入栈
            if(cur.left!=null){
                stack.push(cur.left);
            }
        }
    }
    //非递归实现二叉树的中序遍历
    //从根节点出发，cur,一路向左跑，遇到非空入栈，直到为空循环结束
    //取出栈顶元素，访问，并且让cur指向它的右子树
    //回到步骤二继续执行
    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        TreeNode cur=root;
        while(true){
            while(cur.left!=null){
                cur=cur.left;
                stack.push(cur);
            }
            if(!stack.isEmpty()){
                TreeNode node=stack.pop();
                System.out.print(node.val+" ");
                if(node.right!=null){
                    stack.push(node.right);
                    cur=node.right;
                }
            }else{
                break;
            }
        }
    }
    //非递归实现二叉树的后序遍历
    //从根结点出发，一路向左，遇到非空入栈，遇到空的判断两中情况
    //第一种情况是，当前节点是否有右子树，第二：当前节点的右子树是否被访问过了
    //怎么判断它的右子树被访问过了还是没有呢？使用一个引用prev
    public static void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        TreeNode cur=root;
        TreeNode prev=null;
        while(true){
            while(cur.left!=null){
                cur=cur.left;
                stack.push(cur);
            }
            if(!stack.isEmpty()){
                TreeNode node=stack.peek();
                if(node.right==null || node.right==prev){
                    stack.pop();
                    System.out.print(node.val+" ");
                    prev=node;
                }else if(node.right!=null){
                    stack.push(node.right);
                    cur=node.right;
                }
            }else{
                break;
            }
        }
    }
    public static TreeNode build(){
        TreeNode A=new TreeNode(1);
        TreeNode B=new TreeNode(2);
        TreeNode C=new TreeNode(3);
        TreeNode D=new TreeNode(4);
        TreeNode E=new TreeNode(5);
        TreeNode F=new TreeNode(6);
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        E.left=F;
        return A;
    }
    public static void main(String[] args) {
        TreeNode root=build();
        prevOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
}

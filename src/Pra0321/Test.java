package Pra0321;

import java.util.Stack;

//二叉树前中后序遍历非递归方式
public class Test {
    //二叉树的先序遍历非递归方式
    //分层遍历的时候借助的是队列
    //这里先序遍历创建一个栈，根->右->左
    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            System.out.print(cur.val+" ");
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if(cur.left!=null){
                stack.push(cur.left);
            }
        }
    }
    //二叉树的中序遍历
    //创建一个栈，创建一个引用cur，从根节点出发，
    // 循环一直向左边遍历不为空就入栈，直到为空就结束
    //将栈顶元素取出并访问，让cur指向该节点的右子树，继续重复上面的步骤
    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        stack.push(cur);
        while(true){
            while(cur.left!=null){
                cur=cur.left;
                stack.push(cur);
            }
            //循环结束，栈非空，取出栈顶元素访问
            // 并且让cur指向这个节点的右子树
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
    //后序遍历的非递归方式
    //有两种方法去理解，先序遍历的镜像再逆置就是后序遍历
    //方法二：创建一个栈，创建一个引用cur，从根节点出发
    //一路向左,遇到非空入栈，为空就停止
    //判断栈顶元素是否满足一定的条件，①栈顶元素的右子树为空②栈顶元素的右子树已经被
    //访问过了
    //如果不满足上面的两个条件，让cur指向栈顶元素的右子树，重复执行②即可
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
                if(node.right==null||node.right==prev){
                    prev=node;
                    System.out.print(node.val+" ");
                    stack.pop();
                }else{
                    stack.push(node.right);
                    cur=node.right;
                }
            }else{
                break;
            }
        }
    }
    //创建一个树
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
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
}

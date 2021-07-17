package Pra0717;

public class MyBinaryTree {
    //先序遍历
    public void prevOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        prevOrder(root.left);
        prevOrder(root.right);
    }

    //中序遍历
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    //后序遍历
    public void lastOrder(TreeNode root){
        if(root==null){
            return;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.println(root.val);
    }

    //求节点的个数
    public int getNodeSize(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+getNodeSize(root.left)+getNodeSize(root.right);
    }

    //求叶子结点的个数
    public int getLeafSize(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafSize(root.left)+getLeafSize(root.right);
    }
    //求第k层节点的个数
    public int getSize(TreeNode root,int k){
        if(root==null||k<0){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getSize(root.left,k-1)+getSize(root.right,k-1);
    }
    //求二叉树的高度
    public int  getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return 1+left>right?left:right;
    }

    //查找val所在的节点
    public TreeNode getNode(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode result=getNode(root.left,val);
        if(result!=null){
            return result;
        }
        return getNode(root.right,val);
    }
}

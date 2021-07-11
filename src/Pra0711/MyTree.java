package Pra0711;

public class MyTree{
    public void preOrder(TreeNode root){
        if(root==null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public void lastOrder(TreeNode root){
        if(root==null){
            return;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.println(root.val);
    }

    public int getLeafSize(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafSize(root.left)+getLeafSize(root.right);
    }

    public int getLevelSize(TreeNode root,int k){
        if(root==null||k<=0){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getLevelSize(root.left,k-1)+getLevelSize(root.right,k-1);
    }

}

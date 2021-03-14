package Pra0314;
//二叉树的相关操作
//class Node{
//    String val;
//    Node left;
//    Node right;
//
//    public Node(String val) {
//        this.val = val;
//    }
//}
public class BinaryTree {
    //构建一个二叉树
    public static Node buid(){
        Node A=new Node("A");
        Node B=new Node("B");
        Node C=new Node("C");
        Node D=new Node("D");
        Node E=new Node("E");
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        return A;
    }
    //先序遍历
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        //先打印节点
        System.out.print(root.val+" ");
        //然后访问左子树
        preOrder(root.left);
        //再访问右子树
        preOrder(root.right);
    }
    //中序遍历
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        //先访问左子树
        inOrder(root.left);
        //再打印该节点
        System.out.print(root.val+" ");
        //再访问右子树
        inOrder(root.right);
    }
    //后序遍历
    public static void lastOrder(Node root){
        if(root==null){
            return;
        }
        //先访问左子树
        lastOrder(root.left);
        //再访问右子树
        lastOrder(root.right);
        //再打印该节点
        System.out.print(root.val+" ");
    }
    //求节点个数，方法1
    //用一个来记录
    public static int size=0;
    public static void getSize1(Node root){
        if(root==null){
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
    //求节点个数，方法2
    public static int getSize2(Node root){
        if(root==null){
            return 0;
        }
        return 1+getSize2(root.left)+getSize2(root.right);
    }
    //求叶子节点个数，方法1
    public static int num=0;
    public static void getLeafNum1(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            num++;
        }
        getLeafNum1(root.left);
        getLeafNum1(root.right);
    }
    //求叶子节点个数，方法2
    public static int getLeafNum2(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafNum2(root.left)+getLeafNum2(root.right);
    }
    //求第K层节点个数
    public static int getLevelSize(Node root,int k){
        //树为空
        if(root==null||k<0){
            return 0;
        }
        //树不为空，而且到达了想要的那一层
        if(k==1){
            return 1;
        }
        return getLevelSize(root.left,k-1)+getLevelSize(root.right,k-1);
    }
    //求树的高度（从根节点往上）
    public static int getHeight(Node root){
        if(root==null){
            return 0;
        }
        return 1+(getHeight(root.left)>getHeight(root.right)?getHeight(root.left):getHeight(root.right));
    }
    //查找val所在的节点，如果没有返回null
    //按照先序查找
    //如果找到立即返回
    //*****最难理解*****
    public static Node find(Node root,String val){
        if(root==null){
            return null;
        }
        if(root.val.equals(val)){
            return root;
        }
        Node result=find(root.left,val);
        if(result!=null){
            return result;
        }
        return find(root.right,val);
    }
    public static void main(String[] args) {
        Node root=buid();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        lastOrder(root);
        System.out.println();
        getSize1(root);
        System.out.println(size);
        System.out.println(getSize2(root));
        getLeafNum1(root);
        System.out.println(num);
        System.out.println(getLeafNum2(root));
        System.out.println(getLevelSize(root,1));
        System.out.println(getLevelSize(root,2));
        System.out.println(getLevelSize(root,3));
        System.out.println(getHeight(root));
        System.out.println(find(root,"C").val);
    }
}

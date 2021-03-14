package Pra0314;
class Node{
    String val;
    Node left;
    Node right;

    public Node(String val) {
        this.val = val;
    }
}
public class BinaryTree2 {
    //构建一个二叉树
    public Node build(){
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
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    public void lastOrder(Node root){
        if(root==null){
            return;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.println(root.val);
    }
    //求节点个数
    //方法1
    public int size=0;
    public void getSize1(Node root){
        if(root==null){
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
    public int getSize2(Node root){
        if(root==null){
            return 0;
        }
        return 1+getSize2(root.left)+getSize2(root.right);
    }
    //求叶子节点的个数
    //法1
    public int num=0;
    public void getLeafSize1(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            num++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    //求叶子节点的个数
    //法2
    public int getLeafSize2(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafSize2(root.left)+getLeafSize2(root.right);
    }
    //求第k层节点的个数
    public int getLevelSize(Node root,int k){
        if(root==null||k<0){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getLevelSize(root.left,k-1)+getLevelSize(root.right,k-1);

    }
    //获取二叉树的高度
    public int getHight(Node root){
        if(root==null){
            return 0;
        }
        return 1+getHight(root.left)>getHight(root.right)?getHight(root.left):getHight(root.right);
    }
    //查找val所在的节点，如果没有返回null
    public Node find(Node root,String val){
        if(root==null){
            return null;
        }
        if(root.val.equals(val)){
            return root;
        }
        Node ret=find(root.left,val);
        if(ret!=null){
            return ret;
        }
        return find(root.right,val);
    }
}

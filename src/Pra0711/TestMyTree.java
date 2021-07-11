package Pra0711;

public class TestMyTree {
    public static void main(String[] args) {
        TreeNode A=new TreeNode("A");
        TreeNode B=new TreeNode("B");
        TreeNode C=new TreeNode("C");
        TreeNode D=new TreeNode("D");
        A.left=B;
        A.right=C;
        B.left=D;
        MyTree tree=new MyTree();
        tree.lastOrder(A);
        System.out.println(tree.getLeafSize(A));
        System.out.println(tree.getLevelSize(A,3));
    }
}

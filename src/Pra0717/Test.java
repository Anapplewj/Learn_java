package Pra0717;

public class Test {
    public static void main(String[] args) {
        MyBinaryTree test=new MyBinaryTree();
        TreeNode A=new TreeNode(1);
        TreeNode B=new TreeNode(2);
        TreeNode C=new TreeNode(3);
        TreeNode D=new TreeNode(4);
        TreeNode E=new TreeNode(5);
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        System.out.println(test.isCompleteTree(A));
    }
}

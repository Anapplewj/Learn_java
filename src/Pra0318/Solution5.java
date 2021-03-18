package Pra0318;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String line=sc.nextLine();
            TreeNode root=buid(line);
            inOrder(root);
            System.out.println();
        }
    }
    public static int index=0;
    public static TreeNode buid(String line){
        index=0;
        return _build(line);
    }
    public static TreeNode _build(String line){
        char ch=line.charAt(index);
        if (ch == '#') {
            return null;
        }
        TreeNode root=new TreeNode(ch);
        index++;
        root.left=_build(line);
        index++;
        root.right=_build(line);
        return root;
    }
    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }
}

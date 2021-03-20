package Pra0320;

import java.util.Scanner;

//输入一个先序遍历字符串，包含#，将其构建成一棵二叉树，并对其进行中序遍历
public class Solution6 {
    public static int index=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.next();
            index=0;
            TreeNode root=build(input);
            inOrder(root);
            System.out.println();
        }
    }

    public static TreeNode build(String input){
        char ch=input.charAt(index);
        if(ch=='#'){
            return null;
        }
        TreeNode root=new TreeNode(ch);
        index++;
        root.left=build(input);
        index++;
        root.right=build(input);
        return root;
    }
    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
}

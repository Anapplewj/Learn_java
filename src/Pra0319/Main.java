package Pra0319;

import java.util.Scanner;

//根据已知先序遍历的结果，构建一棵二叉树
//最终结果使用中序遍历表示
//借助队列来实现，遇到#即为空
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String line=sc.next();
            TreeNode1 root=build(line);//构建一棵二叉树
            inOrder(root);//对于构建好的二叉树进行中序遍历
            System.out.println();
        }
    }
    public static int index=0;//使用index表示走到字符串的第几位
    public static TreeNode1 build(String line){
        index=0; //为了防止多组用例互相影响，这里对于index进行赋值
        return _build(line);
    }
    //在这里_build辅助递归，防止在build中对于对于index的值产生影响
    public static TreeNode1 _build(String line){
        char ch=line.charAt(index);
        if (ch == '#') {
            return null;
        }
        //由于这里是先序遍历，所以先是根，再是左子树，再是右子树的构建
        TreeNode1 root=new TreeNode1(ch);
        index++;
        root.left=_build(line);
        index++;
        root.right=_build(line);
        return root;
    }
    public static void inOrder(TreeNode1 root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }
}

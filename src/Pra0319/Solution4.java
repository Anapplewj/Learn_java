package Pra0319;
//根据前序遍历和中序遍历构造二叉树
public class Solution4 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //先序遍历和中序遍历的内容存储在数组当中
    //首先定义一个index,来记录在先序遍历结果中的位置
    //定义一个inorderLeft,inorderRight记录在中序遍历的区间
    //[inorderLeft,inorderRight)
    public static int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //为了防止多组用例之间相互干扰，在这里对index重新初始化
        index=0;
        TreeNode root=build(preorder,inorder,0,inorder.length);
        return root;
    }

    public static TreeNode build(int[] preorder,int[] inorder,int inorderLeft
    ,int inorderRight){
        if(inorderLeft>=inorderRight){
            return null;
        }
        if(index>preorder.length){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index]);
        //找到这个节点在中序遍历中的位置
        int pos=find(root,inorder,inorderLeft,inorderRight);
        index++;
        //构建左右子树
        root.left=build(preorder,inorder,inorderLeft,pos);
        root.right=build(preorder,inorder,pos+1,inorderRight);
        return root;
    }
    public static int find(TreeNode root,int[] inorder,int inorderLeft,int inorderRight){
        for(int i=inorderLeft;i<inorderRight;i++){
            if(inorder[i]==root.val){
                return i;
            }
        }
        return -1;
    }
}

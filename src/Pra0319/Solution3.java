package Pra0319;


//将一棵二叉搜索树转换为排序的双向链表
//首先记录当前的根节点，也就是我们转化完成之后的头节点
public class Solution3 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        //特殊情况
        if(pRootOfTree==null){
            return null;
        }
        if(pRootOfTree.left==null&&pRootOfTree.right==null){
            return pRootOfTree;
        }
        //一般情况
        //先将左子树转化为链表
        TreeNode leftHead=Convert(pRootOfTree.left);
        //再将节点插入到左子树链表的末尾
        TreeNode leftTail=leftHead;
        while(leftTail!=null&&leftTail.right!=null){
            leftTail=leftTail.right;
        }
        //将根节点插入
        if (leftHead!=null) {
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        //将右子树插入
        TreeNode rightHead=Convert(pRootOfTree.right);
        if(rightHead!=null){
            pRootOfTree.right=rightHead;
            rightHead.left=pRootOfTree;
        }
        return leftHead==null?pRootOfTree:leftHead;
    }
}

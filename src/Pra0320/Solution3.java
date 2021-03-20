package Pra0320;

//将一颗二叉搜索树转换为排序的双向链表
//二叉搜索树的特点是中序遍历有序
//将left看作prev，将right看作next
//中序遍历，先将左子树转化为双向链表，再将根节点插入到左子树双向链表的末尾
//再将右子树转化为双向链表，再将根节点和右子树拼接起来，返回左子树的头部
public class Solution3 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        if(pRootOfTree.left==null&&pRootOfTree.right==null){
            return null;
        }
        TreeNode leftHead=Convert(pRootOfTree.left);
        TreeNode leftTail=leftHead;
        while(leftTail!=null&&leftTail.right!=null){
            leftTail=leftTail.right;
        }
        if(leftHead!=null) {
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }
        TreeNode rightHead=Convert(pRootOfTree.right);
        if(rightHead!=null){
            pRootOfTree.right=rightHead;
            rightHead.left=pRootOfTree;
        }
        return leftHead==null?pRootOfTree:leftHead;
    }
}
//发现的问题：总是忽略掉特殊情况，特殊情况才是重中之重的
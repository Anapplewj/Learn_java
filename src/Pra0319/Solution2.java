package Pra0319;
//二叉树的最近公共祖先
//只要记住思路，代码实现不难
//对数进行遍历，从某个结点出发，能同时找到p和q，说明这个节点是"公共祖先"
//那么最近的公共祖先是哪一个呢？只需要记住以下结论即可
//①当前节点自身是否为p或者q
//②当前节点的左子树是否包含p或者q
//③当前节点的右子树是否包含p或者q
//若满足上面三个条件中的两个，说明这个节点就为p和q的最近公共祖先
public class Solution2 {
    //使用一个辅助的变量，可以在任意某个位置修改它的值，可以进行访问
    TreeNode result=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        find(root,p,q);
        return result;
    }
    public boolean find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return false;
        }
        int result1=(root==p||root==q)?1:0;
        int result2=find(root.left,p,q)?1:0;
        int result3=find(root.right,p,q)?1:0;
        if(result1+result2+result3==2){
            result=root;
        }
        //方法的最终返回，找到p或者q，就返回true
        return (result1+result2+result3)>0;
    }
}
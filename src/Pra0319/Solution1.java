package Pra0319;

import java.util.ArrayList;
import java.util.List;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
//二叉树的层序遍历
//进行先序遍历，将层数记录下来，根据层数将该节点放入到最终结果二维链表的某一层
public class Solution1 {
    public static List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        list=new ArrayList<>();
        if(root==null){
            return list;
        }
        helper(root,0);
        return list;
    }
    public void helper(TreeNode root,int level){
        if(list.size()==level){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        if(root.left!=null) {
            helper(root.left, level + 1);
        }
        if(root.right!=null) {
            helper(root.right, level + 1);
        }
    }
}

package Pra0320;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//将一棵二叉树转换为字符串
public class Test {
    public static StringBuffer result1=null;
    public String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        result1 =new StringBuffer();
        build(t);
        result1.deleteCharAt(0);
        result1.deleteCharAt(result1.length()-1);
        return result1.toString();
    }
    public static void build(TreeNode t){
        if(t==null){
            return;
        }
        result1.append("(");
        result1.append(t.val);
        build(t.left);
        if(t.left==null&&t.right!=null){
            result1.append("()");
        }
        build(t.right);
        result1.append(")");
    }
    //根据前序和中序构建二叉树
    public static int index1=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index1=0;
        List<Integer> list=new ArrayList<>();
        for(int x:inorder){
            list.add(x);
        }
        TreeNode root=build1(preorder,list);
        return root;
    }
    public static TreeNode build1(int[] preorder,List<Integer> inorder){
        if(index1>=preorder.length){
            return null;
        }
        if(inorder.isEmpty()){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index1]);
        index1++;
        int pos=inorder.indexOf(root.val);
        root.left=build1(preorder,inorder.subList(0,pos));
        root.right=build1(preorder,inorder.subList(pos+1,inorder.size()));
        return root;
    }
    //从中序遍历和后序遍历构造二叉树
    //始终记得我们需要取出先序遍历中的每个节点，表示根节点，使用index下标去取
    //中序遍历，找到根节点的中序遍历的区间！是根节点的左边和根节点的右边
    public static int index2=0;
    public TreeNode buildTree1(int[] inorder, int[] postorder) {
        index2=postorder.length-1;
        List<Integer> list=new ArrayList<>();
        for(int x:inorder){
            list.add(x);
        }
        TreeNode root=build2(list,postorder);
        return root;
    }
    public static TreeNode build2(List<Integer> inorder,int[] postorder){
        if(inorder.isEmpty()){
            return null;
        }
        if(index2<0){
            return null;
        }
        TreeNode root=new TreeNode(postorder[index2]);
        index2--;
        int pos=inorder.indexOf(root.val);
        root.right=build2(inorder.subList(pos+1,inorder.size()),postorder);
        root.left=build2(inorder.subList(0,pos),postorder);
        return root;
    }
    //二叉搜索树转化为有序的双向链表
    public TreeNode Convert(TreeNode pRootOfTree) {
        //首先判断特殊情况
        if(pRootOfTree==null){
            return null;
        }
        if(pRootOfTree.left==null&&pRootOfTree.right==null){
            return null;
        }
        //一般情况
        //首先将左子树转化为双向链表
        TreeNode leftHead=Convert(pRootOfTree.left);
        TreeNode leftTail=leftHead;
        while(leftTail!=null&&leftTail.right!=null){
            leftTail=leftTail.right;
        }
        if(leftHead!=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        TreeNode rightHead= Convert(pRootOfTree.right);
        if(rightHead!=null){
            pRootOfTree.right=rightHead;
            rightHead.left=pRootOfTree;
        }
        return leftHead==null?pRootOfTree:leftHead;
    }
    //二叉树的最近的公共祖先
    //有三种情况，只要满足其中的两种，那么就说明是最近的公共祖先
    public static TreeNode result=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        build3(root,p,q);
        return result;
    }
    public static boolean build3(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return false;
        }
        if(p==null&&q==null){
            return false;
        }
        //自己是否为p或者q
        int result1=(root==p||root==q)?1:0;
        //左子树包含p或者q
        int result2=build3(root.left,p,q)?1:0;
        //右子树包含p或者q
        int result3=build3(root.right,p,q)?1:0;
        if(result1+result2+result3==2){
            result=root;
        }
        return (result1+result2+result3)>0;
    }
    //二叉树的分层遍历，遍历结果为一个顺序表，那么如何做到呢？
    //用一个变量来记录层数
    public static List<List<Integer>> list=null;
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return null;
        }
        list=new ArrayList<>();
        help(root,0);
        return list;
    }
    public static void help(TreeNode root,int level){
        if(list.size()==level){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        if(root.left!=null){
            help(root.left,level+1);
        }
        if(root.right!=null){
            help(root.right,level+1);
        }
    }
    //二叉树的层序遍历
    //借助队列来完成，将根节点插入进去，取出来
    public void levelOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(true){
            TreeNode cur=queue.poll();
            if(cur==null){
                break;
            }
            System.out.print(cur.val);
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }
    //判断一棵树是否为完全二叉树
    //借助层序遍历，分为两个阶段，第一阶段如果没有找到左子树为空，右子树不为空的情况
    //就进入第二阶段：从当前节点若还能找到节点，那么就不是完全二叉树
    //使用一个变量标记所处阶段
    public boolean isCompleteTree(TreeNode root){
        if(root==null){
            return true;
        }
        boolean level2=false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(true){
            TreeNode cur=queue.poll();
            if(cur==null){
                break;
            }
            if(!level2){
                if(cur.left!=null&&cur.right!=null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                    level2=true;
                }else if(cur.left==null&&cur.right==null){
                    level2=true;
                }else if(cur.left==null&&cur.right!=null){
                    return false;
                }else if(cur.left!=null&&cur.right==null){
                    queue.offer(cur.left);
                    level2=false;
                }
            }else{
                if(cur.left!=null||cur.right!=null){
                    return false;
                }
            }
        }//end while
        return true;
    }
    //对称二叉树
    //左子树等于右子树
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return isMirro(root.left,root.right);
    }
    public boolean isMirro(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        if(s.val!=t.val){
            return false;
        }
        return isMirro(s.left,t.right)&&isMirro(s.right,t.left);
    }
    //判断一棵二叉树是否为平衡二叉树
    //左右子树的高度差不大于1
    //计算出树的高度
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(leftHeight-rightHeight<-1||leftHeight-rightHeight>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return 1+(left>right?left:right);
    }
    //二叉树的最大深度
    public int maxDeep(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxDeep(root.left);
        int right=maxDeep(root.right);
        return 1+(left>right?left:right);
    }
    //另一棵树的子树，t是否为s的子树
    //两棵树是否相同
    public boolean isSubtree(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null){
            return false;
        }
        boolean ret=isSameTree(s,t);
        if(ret){
            return ret;
        }
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    //判断两棵树是否相同
    public boolean isSameTree(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        if(s.val!=t.val){
            return false;
        }
        return isSameTree(s.left,t.left)&&isSameTree(s.right,t.right);
    }
    //二叉树的先序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }
    //按照先序遍历的顺序，查找值为val的节点
    public TreeNode find(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode left=find(root.left,val);
        if(left!=null){
            return left;
        }
        return find(root.right,val);
    }
    //求节点个数
    public int size(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }
    //求叶子节点的个数
    public int getLeafSize(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafSize(root.left)+getLeafSize(root.right);
    }
    //求第k层节点的个数
    public int getLength(TreeNode root,int k){
        if(root==null||k<0){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getLength(root.left,k-1)+getLength(root.right,k-1);
    }
}

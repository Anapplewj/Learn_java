package Pra0326;

import java.util.*;

//二叉树的相关练习题目
public class Tree {
    //二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);

        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }

    //二叉树的中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }

    //二叉树的后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }

    //判断两棵二叉树是否相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    //判断一棵树 t 否为 s 的子树
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }
        boolean ret = isSameTree(s, t);
        if (ret) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    //二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + (left > right ? left : right);
    }

    //判断一棵二叉树是否为平衡二叉树
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (left - right < -1 || left - right > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    //判断一棵二叉树是否为对称二叉树
    //镜像关系
    public boolean isMirro(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isMirro(p.left, q.right) && isMirro(p.right, q.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirro(root.left, root.right);
    }

    //二叉树的层序遍历
    //借助队列来完成
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (true) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                break;
            }
            System.out.println(cur.val);
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

    //判断一棵树是否为完全二叉树
    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean level2 = false;
        while (true) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                break;
            }
            if (!level2) {
                if (cur.left != null && cur.right != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left != null && cur.right == null) {
                    queue.offer(cur.left);
                    level2 = true;
                } else if (cur.left == null && cur.right != null) {
                    return false;
                } else {
                    level2 = true;
                }
            } else {
                if (cur.left != null || cur.right != null) {
                    return false;
                }
            }
        }
        return true;
    }

    //根据用户输入的一串字符串，构建一棵二叉树，并且再对其进行中序遍历
    public static int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            index = 0;
            String input = sc.next();
            TreeNode root = build(input);
            inOrder(root);
            System.out.println();
        }
    }

    //根据先序遍历的结果，构造一棵树
    public static TreeNode build(String input) {
        index = 0;
        return _build(input);
    }

    public static TreeNode _build(String input) {
        char ch = input.charAt(index);
        if (ch == '#') {
            return null;
        }
        TreeNode root = new TreeNode(ch);
        index++;
        root.left = _build(input);
        index++;
        root.right = _build(input);
        return root;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //二叉树的分层遍历
    //得有个标记记录它是第几行层的
    public static List<List<Integer>> list = null;

    public List<List<Integer>> levelOrder(TreeNode root) {
        list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        //当前在第0层，为了和顺序表统一
        helper(root, 0);
        return list;
    }

    public static void helper(TreeNode root, int level) {
        //链表的长度和层数是相同的，如果均等于0,表示链表为空，对空顺序表add是有问题的
        if (list.size() == level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        if (root.left != null) {
            helper(root.left, level + 1);
        }
        if (root.right != null) {
            helper(root.right, level + 1);
        }
    }

    //两个节点的公共祖先
    //公共祖先是：从某一结点出发，两个节点均能找到，说明这个节点就是两个节点的公共祖先
    //最近公共祖先是有三种途径的，只要满足其中两种，就说明是公共祖先
    public static TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        find(root, p, q);
        return result;
    }

    public static Boolean find(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        int result1 = (root == p || root == q) ? 1 : 0;
        int result2 = find(root.left, p, q) ? 1 : 0;
        int result3 = find(root.right, p, q) ? 1 : 0;
        if (result1 + result2 + result3 == 2) {
            result = root;
        }
        //方法的最终返回，找到p或者q，就返回true
        return (result1 + result2 + result3) > 0;
    }
    //把一棵二叉搜索树转化为有序的双向链表
    //二叉搜索树的特点是，对其进行中序遍历结果是有序的
    //双向链表，可以将left看作prev,将right看作next
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        if(pRootOfTree.left==null && pRootOfTree.right==null){
            return pRootOfTree;
        }
        //先递归地将左子树转化为双向链表
        TreeNode leftHead=Convert(pRootOfTree.left);
        TreeNode leftTail=leftHead;
        while(leftTail!=null && leftTail.right!=null){
            leftTail=leftTail.right;
        }
        //将根节点插入到左子树转化的双向链表
        if(leftHead!=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        TreeNode rightHead=Convert(pRootOfTree.right);
        if(rightHead!=null){
            pRootOfTree.right=rightHead;
            rightHead.left=pRootOfTree;
        }
        return leftHead==null?pRootOfTree:leftHead;
    }
    //根据先序和中序遍历构建二叉树
    public static int index3=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        index3=0;
        for(int x:inorder){
            list.add(x);
        }
        return _build2(preorder,list);
    }
    public static TreeNode _build2(int[] preorder,List<Integer> inorder){
        if(index3>=preorder.length){
            return null;
        }
        if(inorder.isEmpty()){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index]);
        index3++;
        int pos=inorder.indexOf(root.val);
        root.left=_build2(preorder,inorder.subList(0,pos));
        root.right=_build2(preorder,inorder.subList(pos+1,inorder.size()));
        return root;
    }
    //根据二叉树的后续中序，创建一棵二叉树
    public static int index4=0;
    public TreeNode buildTree2(int[] inorder, int[] postorder) {
        if(postorder.length==0){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        for(int x:inorder){
            list.add(x);
        }
        index4=postorder.length-1;
        return _build3(list,postorder);
    }
    public static TreeNode _build3(List<Integer> inorder,int[] postorder){
        if(index4<0){
            return null;
        }
        if(list.isEmpty()){
            return null;
        }
        TreeNode root=new TreeNode(postorder[index4]);
        index4--;
        int pos=inorder.indexOf(root.val);
        root.right=_build3(inorder.subList(pos+1,inorder.size()),postorder);
        root.left=_build3(inorder.subList(0,pos),postorder);
        return root;
    }
    //前序遍历一棵二叉树，并且将其转化成带符号和整数组成的字符串
    public static StringBuffer resul2=null;
    public String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        resul2=new StringBuffer();
        resul2.deleteCharAt(0);
        resul2.deleteCharAt(resul2.length()-1);
        return resul2.toString();
    }
    public static void prevOrder(TreeNode root){
        if(root==null){
            return;
        }
        resul2.append("(");
        resul2.append(root.val);
        prevOrder(root.left);
        if(root.left==null && root.right!=null){
            resul2.append("()");
        }
        prevOrder(root.right);
        resul2.append(")");
    }
}
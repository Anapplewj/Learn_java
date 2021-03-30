package Pra0329;

//实现一颗二叉搜索树
class TreeNode{
    public int key;
    public int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int key,int value) {
        this.key = key;
        this.value=value;
    }
}
public class BinarySearchTree {
    private TreeNode root=null;
    //查找
    public Integer get(int key){
        TreeNode cur=root;
        while(cur!=null){
            if(key<cur.key && cur.left!=null){
                cur=cur.left;
            }else if(key>cur.key && cur.right!=null){
                cur=cur.right;
            }else{
                return cur.value;
            }
        }
        return null;
    }
    //添加元素
    public void put(int key,int value){
        if(root==null){
            root=new TreeNode(key,value);
            return;
        }
        //首先找到插入的位置
        TreeNode cur=root;
        TreeNode parent=null;
        while(cur!=null){
            if(key<cur.key && cur.left!=null){
                parent=cur;
                cur=cur.left;
            }else if(key>cur.key && cur.right!=null){
                parent=cur;
                cur=cur.right;
            }else if(cur.key ==key){
                cur.value=value;
                return;
            }
        }
        TreeNode newNode=new TreeNode(key,value);
        if(cur==null && key<parent.key){
            parent.left=newNode;
        }else{
            parent.right=newNode;
        }
    }
    //删除一个元素需要分为很多情况来考虑
    public void remove(int key){
        //首先找到删除的位置,并且记录父亲的位置
        TreeNode cur=root;
        TreeNode parent=null;
        while(cur!=null){
            if(key<cur.key){
                parent=cur;
                cur=cur.left;
            }else if(key>cur.key){
                parent=cur;
                cur=cur.right;
            }else{
                //找到了
                removeNode(parent,cur);
                return;
            }
        }
    }
    private void removeNode(TreeNode parent,TreeNode cur){
        if(cur.left==null){
            if(cur==root){
                root=cur;
                //cur是parent的左子树
            }else if(parent.left==cur){
                parent.left=cur.right;
            }else if(parent.right==cur){
                parent.right=cur.right;
            }
        }else if(cur.right==null){
            if(cur==root){
                root=cur;
            }else if(parent.left==cur){
                parent.left=cur.left;
            }else if(parent.right==cur){
                parent.right=cur.left;
            }
        }else{
            //找到右子树中最小的值，从右子树开始，一路左找，直到cur的左子树为空
            //那么parent.left=cur.right;
            TreeNode goat=cur.right;
            TreeNode goatParent=cur;
            while(goat!=null && goat.left!=null){
                goatParent=goat;
                goat=goat.left;
            }
            cur.key=goat.key;
            cur.value=goat.value;
            if(goat==goatParent.left){
                goatParent.left=goat.right;
            }else{
                goatParent.right=goat.right;
            }
        }
    }
}

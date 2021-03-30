package Pra0330;
//二叉搜索树
class BinaryNode{
    int key;
    int value;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class MyBinarySearchTree {
    BinaryNode root=null;
    //查找key
    public Integer get(int key){
        BinaryNode cur=root;
        while(cur!=null){
            if(key<cur.key){
                cur=cur.left;
            }else if(key>cur.key){
                cur=cur.right;
            }else{
                return cur.value;
            }
        }
        return null;
    }
    //插入
    public void put(int key,int value){
        BinaryNode parent=null;
        BinaryNode cur=root;
        while(cur!=null){
            if(key<cur.key){
                parent=cur;
                cur=cur.left;
            }else if(key>cur.key){
                parent=cur;
                cur=cur.right;
            }else{
                cur.value=value;
                return;
            }
        }
        //找到插入的位置了，此时cur指向空
        //具体要插入到parent的左子树还是右子树，只需要判断key大于还是小于parent的key
        BinaryNode newNode=new BinaryNode(key,value);
        if(key<parent.key){
            parent.left=newNode;
        }else{
            parent.right=newNode;
        }
    }
    //删除键值对
    public void remove(int key){
        //首先找到要删除键值对的位置
        BinaryNode parent=null;
        BinaryNode cur=root;
        while(cur!=null){
            if(key<cur.key){
                parent=cur;
                cur=cur.left;
            }else if(key>cur.key){
                parent=cur;
                cur=cur.right;
            }else{
                //找到要删除的节点了
                removeNode(parent,cur);
            }
        }
    }
    public void removeNode(BinaryNode parent,BinaryNode cur) {
        if(cur.left==null){
            if(root==cur){
                root=cur.right;
            }else if(parent.left==cur){
                parent.left=cur.right;
            }else{
                parent.right=cur.right;
            }
        }else if(cur.right==null){
            if(root==cur){
                root=cur.left;
            }else if(parent.left==cur){
                parent.left=cur.left;
            }else{
                parent.right=cur.left;
            }
        }else{
            BinaryNode parentGoat=cur;
            BinaryNode goat=cur.right;
            //从待删节点的右子树中找到key最小的节点goat
            while(goat.left!=null){
                parentGoat=goat;
                goat=goat.left;
            }
            //将goat的信息赋给待删节点cur,相当于cur被删除了，此时只需要删除goat就行
            cur.key=goat.key;
            cur.value=goat.value;
            //由于goat是一路向左找的，所以goat一定没有左子树
            if(parentGoat.left==goat){
                parentGoat.left=goat.right;
            }else{
                parentGoat.right=goat.right;
            }
        }
    }
}

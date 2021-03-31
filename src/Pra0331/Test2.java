package Pra0331;

import java.util.Arrays;
import java.util.Stack;

public class Test2 {
    //我裂开了，为什么如此简单的代码，我还是会写错
    //非递归实现二叉树的先序遍历
    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            System.out.print(cur.val+" ");
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if(cur.left!=null){
                stack.push(cur.left);
            }
        }
    }
    //非递归实现二叉树的中序遍历
    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        TreeNode cur=root;
        while(true){
            while(cur.left!=null){
                cur=cur.left;
                stack.push(cur);
            }
            //如果当前节点的left等于空，那么它就是最左边的叶子结点
            //访问它，如果它有右子树，让cur指向它的右子树
            if(!stack.isEmpty()){
                TreeNode node=stack.pop();
                System.out.print(node.val+" ");
                if(node.right!=null){
                    stack.push(node.right);
                }
            }else{
                break;
            }
        }
    }
    //非递归实现二叉树的后序遍历
    public static void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        TreeNode cur=root;
        TreeNode prev=null;
        while(true){
            while(cur.left!=null){
                cur=cur.left;
                stack.push(cur);
            }
            if(!stack.isEmpty()){
                TreeNode node=stack.peek();
                if(node.right==null || prev==node.right){
                    prev=node;
                    stack.pop();
                    System.out.print(node.val+" ");
                }else{
                    stack.push(node.right);
                    cur=node.right;
                }
            }else{
                break;
            }
        }
    }
    public static TreeNode build(){
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(6);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.right=f;
        return a;
    }
    //堆排序
    public static void heapSort(int[] arr){
        createHeap(arr);
        int heapSize=arr.length;
        while(heapSize>0){
            swap(arr,0,heapSize-1);
            heapSize--;
            shiftDown(arr,heapSize,0);
        }
    }
    public static void shiftDown(int[] arr,int size,int index){
        if(index>=size){
            return;
        }
        int parent=index;
        int child=parent*2+1;
        while(child<size){
            if(child+1<size && arr[child+1]>arr[child]){
                child=child+1;
            }
            if(arr[child]>arr[parent]){
                swap(arr,child,parent);
            }else{
                break;
            }
            parent=child;
            child=parent*2+1;
        }
    }
    public static void createHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }
    //快速排序,选取一个基准值
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }
    private static void _quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int index=healper(arr,left,right);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);
    }
    private static int healper(int[] arr,int left,int right){
        int v=arr[right];
        int l=left;
        int r=right;
        while(l<r){
            while(l<r && arr[l]>=v){
                l++;
            }
            while(l<r && arr[r]<=v){
                r--;
            }
            swap(arr,l,r);
        }
        swap(arr,l,right);
        return l;
    }
    //归并排序
    public static void mergeSort(int[] arr){
        _merge(arr,0,arr.length);
    }
    private static void _merge(int[] arr,int left,int right){
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        _merge(arr,left,mid);
        _merge(arr,mid,right);
        merge(arr,left,mid,right);
    }
    private static void merge(int[] arr,int left,int mid,int right){
        if(left>=right){
            return;
        }
        int l=left;
        int r=mid;
        int[] result=new int[right-left];
        int size=0;
        while(l<mid && r<right){
            if(arr[l]<=arr[r]){
                result[size]=arr[l];
                l++;
            }else{
                result[size]=arr[r];
                r++;
            }
            size++;
        }
        while(l>=mid && r<right){
            result[size]=arr[r];
            r++;
            size++;
        }
        while(r>=right && l<mid){
            result[size]=arr[l];
            l++;
            size++;
        }
        for(int i=0;i<result.length;i++){
            arr[left+i]=result[i];
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
//        TreeNode root=build();
//        postOrder(root);
        int[] arr={9,5,2,7,3,8,6,0,12,101,-3};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

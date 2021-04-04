package Pra0404;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
        }
        int length=nums.length/2;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>length){
                return entry.getKey();
            }
        }
        return -1;
    }
    //快速排序
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }
    private static void _quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid=partition(arr,left,right);
        _quickSort(arr,left,mid-1);
        _quickSort(arr,mid+1,right);
    }
    private static int partition(int[] arr,int left,int right){
        int v=arr[right];
        int l=left;
        int r=right;
        while(l<r){
            while(l<r && arr[l]<=v){
                l++;
            }
            while(l<r && arr[r]>=v){
                r--;
            }
            swap(arr,l,r);
        }
        swap(arr,l,right);
        return l;
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,8,6,102,35,-4};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //两个节点的公共祖先
    //由于是搜索二叉树,所以不考虑这么做,如果两个节点的值,均比root
    //的值小,那么在root的左子树中寻找,如果均比root的值大,
    //那么在root的右子树中寻找,若不满足上面两个条件就返回root
    public static TreeNode result=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        find(root,p,q);
        return result;
    }
    private boolean find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return false;
        }
        int result1=(root==p || root==q)?1:0;
        int result2=find(root.left,p,q)?1:0;
        int result3=find(root.right,p,q)?1:0;
        if(result1+result2+result3==2){
            result=root;
        }
        return (result1+result2+result3)>0;
    }
}

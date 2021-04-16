package Pra0416;

import java.util.Arrays;
import java.util.Stack;

public class MySort {
    //快速排序(非递归版本)
    // 基本思想为：选取一个基准值，从右边开始
    //从左到右找到一个比基准值大的，从右到左找到一个比基准值小的
    //交换两个元素，最终在重合的地方也进行交换
    //前开后闭的区间
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
            while(l<r&&arr[l]<=v){
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
    //总结： 快速排序的时间复杂度为：平均：O(nlog(n)),最坏：O(n^2)
    // 空间复杂度为：平均：O(n),最好 O(log(n))

    //快速排序，递归版本,借助栈来实现
    public static void quickSort2(int[] arr){
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        stack.push(arr.length-1);
        while(!stack.isEmpty()){
            int end=stack.pop();
            int beg=stack.pop();
            if(beg>=end){
               continue;
            }
            int index=partition(arr,beg,end);
            stack.push(beg);
            stack.push(index-1);

            stack.push(index+1);
            stack.push(end);
        }
    }
    //归并排序
    //思想为先将数组划分为一个一个的小分组，直到小数组的长度为1的时候
    //就不能再划分了，这个时候就将其合并
    //也就是将两个有序的数组，合并为一个新的有序数组
    public static void mergSort(int[] arr){
        _mergeSort(arr,0,arr.length);
    }
    private static void _mergeSort(int[] arr,int left,int right){
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        _mergeSort(arr,left,mid);
        _mergeSort(arr,mid,right);
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
            if(l<r && arr[l]<=arr[r]){
                result[size]=arr[l];
                l++;
            }else if(l<r && arr[r]<arr[l]){
                result[size]=arr[r];
                r++;
            }
            size++;
        }
        while(l<mid && r>=right){
            result[size]=arr[l];
            size++;
            l++;
        }
        while(r<right && l>=mid){
            result[size]=arr[r];
            size++;
            r++;
        }
        for(int i=0;i<result.length;i++){
            arr[left+i]=result[i];
        }
    }
    //归并排序的时间复杂度为：O(nlog(n)),空间复杂度O(n)
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,8,6,-1,100,37};
        mergSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package Pra0326;

import java.util.Arrays;

public class MySort {
    //归并排序
    //合并两个有序数组为一个有序数组，但是数组本身并不是有序的
    //递归去处理，从长度为1时开始合并
    public static void mergeSort(int[] arr){
        _merge(arr,0,arr.length);
    }
    //[left,right),前闭后开的区间
    //数组的长度为 right-left
    public static void _merge(int[] arr,int left,int right){
        //数组里面的元素只有一个或者没有，就不用进行排序操作
        //直接返回即可
        if(right-left<=1){
            return;
        }
        //将数组一分为二
        int mid=(left+right)/2;
        //对左边的数组进行排序
        _merge(arr,left,mid);
        //对右边的数组进行排序
        _merge(arr,mid,right);
        //合并左右两边两个数组
        merge(arr,left,mid,right);
    }
    //合并两个有序数组
    //[left,mid),[mid,right)
    public static void merge(int[] arr, int left, int mid, int right) {
        if(left>=right){
            return;
        }
        //创建一个临时数组，用来保存中间结果
        int[] temp=new int[right-left];
        int tempSize=0;//用tempSize记录temp插入的下标
        int l=left;
        int r=mid;
        while(l<mid && r<right){
            if(arr[l]<=arr[r]){
                temp[tempSize]=arr[l];
                l++;
            }else{
                temp[tempSize]=arr[r];
                r++;
            }
            tempSize++;
        }
        //左边的数组空了，就将右边的数组剩余部分全部拷贝过去
        while(l>=mid && r<right){
            temp[tempSize]=arr[r];
            r++;
        }
        //右边的数组空了，就将左边的数组剩余部分全部拷贝过去
        while(r>=right && l<mid){
            temp[tempSize]=arr[l];
            l++;
        }
        //插入之后，将临时数组中的元素拷贝回原来的数组
        for(int i=0;i<temp.length;i++){
            arr[left+i]=temp[i];
        }
    }
    public static void mergeSortByLoop(int[] arr){
        //gap表示当前待合并有序数组的长度
        for(int gap=1;gap<arr.length;gap*=2) {
            //gap=1表示将长度为1的有序数组两两合并
            //gap=2表示将长度为2的有序数组两两合并
            //gap=3表示将长度为3的有序数组两两合并
            for(int i=0;i<arr.length;i+=2*gap){
                int left=i;
                int mid=i+gap;
                if(mid>=arr.length){
                    mid=arr.length;
                }
                int right=i+2*gap;
                if(right>=arr.length){
                    right=arr.length;
                }
                //merge方法上面有
                merge(arr,left,mid,right);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,8};
        mergeSortByLoop(arr);
        System.out.println(Arrays.toString(arr));
    }
}

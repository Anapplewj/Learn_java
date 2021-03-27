package Pra0327;

import java.util.Arrays;
import java.util.Stack;

public class MySort {
    //1.插入排序
    //[0,bound)表示已排序的区间，[bound,arr.length)表示待排序区间
    public static void insertSort(int[] arr){
        for(int bound=1;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(v>arr[cur]){
                    arr[cur+1]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1]=v;
        }
    }
    //希尔排序
    public static void shellSort(int[] arr){
        int gap=arr.length/2;
        while(gap>=1){
            _shellSort(arr,gap);
            gap/=2;
        }
    }
    public static void _shellSort(int[] arr,int gap){
        for(int bound=gap;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-gap;
            for(;cur>=0;cur-=gap){
                if(v>arr[cur]){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap]=v;
        }
    }
    //选择排序
    public static void selectSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=bound+1;cur<arr.length;cur++){
                if(arr[bound]<arr[cur]){
                    swap(arr,bound,cur);
                }
            }
        }
    }
    //堆排序
    public static void heapSort(int[] arr){
        creatHeap(arr);
        int heapSize=arr.length;
        while(heapSize>0){
            swap(arr,0,heapSize-1);
            heapSize--;
            shiftDown(arr,heapSize,0);
        }
    }
    //向下调整
    public static void shiftDown(int[] arr,int size,int index){
        if(arr.length==0){
            return;
        }
        int parent=index;
        int child=parent*2+1;
        while(child<size){
            while(child+1<size && arr[child+1]<arr[child]){
                child=child+1;
            }
            if(arr[child]<arr[parent]){
                swap(arr,child,parent);
            }else{
                break;
            }
            parent=child;
            child=parent*2+1;
        }
    }
    //建堆
    public static void creatHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=arr.length-1;cur>bound;cur--){
                if (arr[cur] > arr[cur-1]) {
                    swap(arr,cur,cur-1);
                }
            }
        }
    }
    //快速排序,找到一个基准值，数组的末尾
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }
    public static void _quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int index=partition(arr,left,right);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);
    }
    public static int partition(int[] arr,int left,int right){
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
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={9,5,2,7,8,3,6,8,0};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

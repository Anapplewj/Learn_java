package Pra0413;

import java.util.Arrays;

public class Solution{
    //插入排序
    public static void insertSort(int[] arr){
        for(int bound=1;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(arr[cur]>v){
                    arr[cur+1]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1]=v;
        }
    }
    //时间复杂度为: 最好O(N),最坏平均O(N^2),空间复杂度O(1)
    //希尔排序
    public static void shellSort(int[] arr){
        int gap=arr.length/2;
        while(gap>0){
            _shellSort(arr,gap);
            gap/=2;
        }
    }
    private static void _shellSort(int[] arr,int gap){
        for(int bound=gap;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-gap;
            for(;cur>=0;cur-=gap){
                if(arr[cur]>v){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap]=v;
        }
    }
    //时间复杂度为: 最好:O(N),平均O(n^1.3),最坏O(n^2),空间复杂度:O(1)
    //堆排序
    public static void heapSort(int[] arr){
        //首先建堆
        createHeap(arr);
        int heapSize=arr.length;
        while(heapSize>0){
            swap(arr,0,heapSize-1);
            heapSize--;
            shiftDown(arr,heapSize,0);
        }
    }
    //向下调整
    private static void shiftDown(int[] arr,int size,int index){
        int parent=index;
        int child=parent*2+1;
        while(child<size){
            if(child+1<size&&arr[child]<arr[child+1]){
                child=child+1;
            }
            if(arr[parent]<arr[child]){
                swap(arr,parent,child);
            }else{
                break;
            }
            parent=child;
            child=parent*2+1;
        }
    }
    private static void createHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }
    //堆排序的时间复杂度为O(Nlog(n)),对数据不敏感,空间复杂度为O(1)
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,8,100,-2};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
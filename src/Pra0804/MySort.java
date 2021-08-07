package Pra0804;

import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,8,100,-1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //堆排序
    private static void heapSort(int[] arr){
        //1.建堆
        createHeap(arr);
        int heapSize=arr.length;
        while (heapSize>1){
            swap(arr,0,heapSize-1);
            heapSize--;
            shiftDown(arr,heapSize,0);
        }
    }
    private static void shiftDown(int[] arr,int size,int index){
        int parent=index;
        int child=parent*2+1;
        while(child<size){
            if(child+1<size&&arr[child+1]>arr[child]){
                child+=1;
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
    //希尔排序
    private static void shellSort(int[] arr){
        int gap=arr.length/2;
        while (gap>=1){
            _shellSort(arr,gap);
            gap/=2;
        }
    }

    private static void _shellSort(int[] arr,int gap){
        for(int bound=gap;bound<arr.length;bound+=gap){
            int v=arr[bound];
            int cur=bound-gap;
            for(;cur>=0;cur-=gap){
                if(v<arr[cur]){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap]=v;
        }
    }
    //插入排序
    private static void insertSort(int[] arr){
        for(int bound=1;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(v<arr[cur]){
                    arr[cur+1]=arr[cur];
                }else {
                    break;
                }
            }
            arr[cur+1]=v;
        }
    }
    //冒泡排序
    private static void bubbleSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=arr.length-1;cur>bound;cur--){
                if(arr[cur]<arr[cur-1]){
                    swap(arr,cur,cur-1);
                }
            }
        }
    }
    //归并排序
    private static void mergeSort(int[] arr){
        _mergeSort(arr,0,arr.length);
    }

    private static void _mergeSort(int[] arr, int left, int right){
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        _mergeSort(arr,left,mid);
        _mergeSort(arr,mid,right);
        merge(arr,left,mid,right);
    }
    private static void mergeSort2(int[] arr){
        for(int gap=1;gap<arr.length;gap*=2){
            for(int i=0;i<arr.length;i+=gap*2){
                int left=i;
                int mid=i+gap;
                if(mid>arr.length){
                    mid=arr.length;
                }
                int right=i+2*gap;
                if(right>arr.length) {
                    right = arr.length;
                }
                merge(arr,left,mid,right);
            }
        }

    }
    private static void merge(int[] arr,int left,int mid,int right){
        int[] result=new int[right-left];
        int size=0;
        int l=left;
        int r=mid;
        while (l<mid&&r<right){
            if(arr[l]<=arr[r]){
                result[size]=arr[l];
                l++;
            }else{
                result[size]=arr[r];
                r++;
            }
            size++;
        }
        while(l<mid&&r>=right){
            result[size]=arr[l];
            l++;
            size++;
        }
        while(r<right&&l>=mid){
            result[size]=arr[r];
            r++;
            size++;
        }
        for(int i=0;i<result.length;i++){
            arr[left+i]=result[i];
        }
    }
    //选择排序
    private static void selectSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=bound+1;cur<arr.length;cur++){
                if(arr[bound]>arr[cur]){
                    swap(arr,bound,cur);
                }
            }
        }
    }
    //快速排序
    private static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }

    private static void _quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int index=partition(arr,left,right);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);
    }

    private static int partition(int[] arr,int left,int right){
        int v=arr[right];
        int l=left;
        int r=right;
        while (l<r){
            while (l<r&&arr[l]<=v){
                l++;
            }
            while (l<r&&arr[r]>=v){
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
}

package Pra0626;

import java.util.Arrays;
import java.util.Stack;

//升序
public class MySort {
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,100,-1};
        mergeByLoop(arr);
        System.out.println(Arrays.toString(arr));
    }
    //插入排序,从待排序区间取到第一个元素，在已排序区间找到一个合适的位置插入
    private static void insertSort(int[] arr){
        for(int bound=1;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(v<arr[cur]){
                    arr[cur+1]=arr[cur];
                }else{
                    //找到了
                    break;
                }
            }
            arr[cur+1]=v;
        }
    }
    //希尔排序
    private static void shellSort(int[] arr){
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
                if(v<arr[cur]){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap]=v;
        }
    }

    private static void selectSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=bound+1;cur<arr.length;cur++){
                if(arr[bound]>arr[cur]){
                    swap(arr,bound,cur);
                }
            }
        }
    }

    private static void heapSort(int[] arr){
        createHeap(arr);
        int heapSize=arr.length;
        while(heapSize>1){
            swap(arr,0,heapSize-1);
            heapSize--;
            shiftDown(arr,heapSize,0);
        }
    }

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

    private static void bubbleSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=arr.length-1;cur>bound;cur--){
                if(arr[cur-1]>arr[cur]){
                    swap(arr,cur-1,cur);
                }
            }
        }
    }
    private static void quickSort1(int[] arr){
        _quickSort1(arr,0,arr.length-1);
    }

    private static void _quickSort1(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int index=partition(arr,left,right);
        _quickSort1(arr,left,index-1);
        _quickSort1(arr,index+1,right);
    }
    //快速排序非递归版
    private static void quickSort2(int[] arr){
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
    private static int partition(int[] arr,int left,int right){
        int v=arr[right];
        int l=left;
        int r=right;
        while(l<r){
            while(l<r&&arr[l]<=v){
                l++;
            }
            while(l<r&&arr[r]>=v){
                r--;
            }
            swap(arr,l,r);
        }
        swap(arr,l,right);
        return l;
    }

    private static void mergeSort(int[] arr){
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

    private static void merge(int[] arr, int left, int mid, int right) {
        if(left>=right){
            return;
        }
        int[] result=new int[right-left];
        int size=0;
        int l=left;
        int r=mid;
        while(l<mid&&r<right){
            if(arr[l]<=arr[r]){
                result[size]=arr[l];
                l++;
            }else{
                result[size]=arr[r];
                r++;
            }
            size++;
        }
        if(r>=right&&l<mid){
            result[size]=arr[l];
            l++;
            size++;
        }
        if(l>=mid&&r<right){
            result[size]=arr[r];
            r++;
            size++;
        }
        for(int i=0;i<size;i++){
            arr[left+i]=result[i];
        }
    }
    private static void mergeByLoop(int[] arr){
        for(int gap=1;gap<arr.length;gap*=2){
            //gap=1表示将长度为1的数组两两合并
            for(int i=0;i<arr.length;i+=gap*2){
                int left=i;
                int mid=i+gap;
                if(mid>=arr.length){
                    mid=arr.length;
                }
                int right=i+2*gap;
                if(right>=arr.length){
                    right=arr.length;
                }
                merge(arr,left,mid,right);
            }
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

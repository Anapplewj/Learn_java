package Pra0401;
import java.util.Arrays;
import java.util.Stack;

public class MySort {
    //堆排序 时间复杂度：O(nlog(n)) 空间复杂度：O(1)
    public static void heapSort(int[] arr){
        createHeap(arr);
        int heapSize=arr.length;
        while(heapSize>0){
            swap(arr,0,heapSize-1);
            heapSize--;
            shiftDown(arr,heapSize,0);
        }
    }
    private static void shiftDown(int[] arr,int size,int index){
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
    private static void createHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //快速排序 时间复杂度： 平均：O(nlog(n))，最坏：O(n^2),
    // 空间复杂度:平均：O(log(n))，最坏O(n)
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }
    private static void _quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid= partition(arr,left,right);
        _quickSort(arr,left,mid-1);
        _quickSort(arr,mid+1,right);
    }
    private static int partition(int[] arr, int left, int right){
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
    //非递归版快速排序
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
            stack.push(index+1);
            stack.push(end);

            stack.push(beg);
            stack.push(index-1);
        }
    }
    //归并排序 时间复杂度： 空间复杂度：
    public static void mergeSort(int[] arr){
        _mergeSort(arr,0,arr.length);
    }
    private static void _mergeSort(int[] arr,int left,int right){
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        //将mid两边分别排成有序数组
        _mergeSort(arr,left,mid);
        _mergeSort(arr,mid,right);
        merge(arr,left,mid,right);
    }
    //合并两个有序数组为一个新的有序数组
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
        while(l<mid && r>=right){
            result[size]=arr[l];
            l++;
            size++;
        }
        for(int i=0;i<result.length;i++){
            arr[left+i]=result[i];
        }
    }
    //归并排序的非递归版
    public static void mergeSort2(int[] arr){
        for(int gap=1;gap<arr.length;gap*=2){
            for(int i=0;i<arr.length;i+=2*gap){
                int left=i;
                int mid=left+gap;
                if(mid>=arr.length){
                    mid=arr.length;
                }
                int right=left+2*gap;
                if(right>=arr.length){
                    right=arr.length;
                }
                merge(arr,left,mid,right);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,8,0,123,45,-3};
        mergeSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}

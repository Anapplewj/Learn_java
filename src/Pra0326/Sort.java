package Pra0326;

import java.util.Arrays;
import java.util.Stack;

//练习七种排序算法
public class Sort {
    //1.插入排序
    public static void insertSort(int[] arr){
        for(int bound=1;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(v<arr[cur]){
                    arr[cur+1]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1]=v;
        }
    }
    //2.希尔排序
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
                if(v<arr[cur]){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap]=v;
        }
    }
    //3.选择排序
    public static void selectSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=bound+1;cur<arr.length;cur++){
                if(arr[bound]>arr[cur]){
                    swap(arr,bound,cur);
                }
            }
        }
    }
    //4.堆排序
    public static void heapSort(int[] arr){
        //首先建堆
        creatHeap(arr);
        int heapSize=arr.length;
        //堆顶元素和最后一个元素交换，并删除
        while(heapSize>0) {
            swap(arr, 0, heapSize - 1);
            heapSize--;
            shiftDown(arr,heapSize,0);
        }

    }
    //向下调整
    public static void shiftDown(int[] arr,int size,int index){
        int parent=index;
        int child=parent*2+1;
        while(child<size){
            if(child+1<size && arr[child]<arr[child+1]){
                child=child+1;
            }
            if(arr[child]>arr[parent]){
                swap(arr,parent,child);
            }else{
                break;
            }
            parent=child;
            child=parent*2+1;
        }
    }
    public static void creatHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }
    //5.冒泡排序
    public static void bubbleSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=arr.length-1;cur>bound;cur--){
                if(arr[cur]<arr[cur-1]){
                    swap(arr,bound,cur);
                }
            }
        }
    }
    //6.快速排序,前闭后闭的区间
    //快速排序的思想就是，选取一个基准值,比基准值小的放在基准值的左边
    // 比基准值大的，放在基准值的右边
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }
    public static void _quickSort(int[] arr,int left,int right){
        //只有一个元素，空区间，不需要处理
        if(left>=right){
            return;
        }
        //找到重合的地方，将数组分为两个部分
        int index=partition(arr,left,right);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);
    }
    public static int partition(int[] arr,int left,int right){
        int v=arr[right];
        int l=left;
        int r=right-1;
        while(l<r){
            //从左到右找到一个大于等于基准值的
            while(l<r && arr[l]<=v){
                l++;
            }
            //从右到左找到一个小于等于基准值的
            while(l<r && arr[r]>=v){
                r--;
            }
            swap(arr,l,r);
        }
        //l和r重合的地方和基准值交换
        swap(arr,l,right);
        return l;
    }
    //6.快速排序的非递归实现
    //创建一个栈，将区间传进去
    public static void quickSortByLoop(int[] arr){
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        stack.push(arr.length-1);
        while(!stack.isEmpty()){
            int end=stack.pop();
            int beg=stack.pop();
            //只有一个元素，空区间，不需要处理
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
    //7.归并排序，递归版本
    public static void mergeSort(int[] arr){
        _merge(arr,0,arr.length);
    }
    public static void _merge(int[] arr,int left,int right){
        //区间里面的元素小于等于一个，就不用进行排序了
        if(right-left<=1){
            return;
        }
        //将数组一分为二
        int mid=(left+right)/2;
        //将左边的区间进行排序
        _merge(arr,left,mid);
        //将右边的数组进行排序
        _merge(arr,mid,right);
        merge(arr,left,mid,right);
    }
    //将两个有序数组合并为一个有序数组
    public static void merge(int[] arr,int left,int mid,int right){
        if(left>=right){
            return;
        }
        int[] temp=new int[right-left];
        int tempSize=0;
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
        while(r<right && l>=mid){
            temp[tempSize]=arr[r];
            r++;
            tempSize++;
        }
        while(r>=right && l<mid){
            temp[tempSize]=arr[l];
            l++;
            tempSize++;
        }
        //将临时数组中的元素拷贝回原数组中
        for(int i=0;i<temp.length;i++){
            arr[i+left]=temp[i];
        }
    }
    //7.归并排序，非递归版本
    public static void mergeSortByLoop(int[] arr){
        //分组系数从1开始递增，倒腾数组下标即可
        for(int gap=1;gap<arr.length;gap*=2){
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
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,8};
        mergeSortByLoop(arr);
        System.out.println(Arrays.toString(arr));
    }
}

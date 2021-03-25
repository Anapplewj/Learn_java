package Pra0324;

import java.util.Arrays;
import java.util.Stack;

public class MySort {
    //插入排序
    //[0,bound)表示已排区间，[bound,length-1]表示待排区间
    //将待排区间的第一个元素v取出来，在已排区间中找到合适的插入位置并插入
    //以升序为例，升序从左到右依次递增
    public static void insertSort(int[] arr){
        for(int bound=1;bound<arr.length;bound++){
            //由于后面涉及到元素的挪动，可能会将bound位置的元素覆盖掉，所以将bound位置的元素取出保存起来
            int v=arr[bound];
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(v<arr[cur]){
                    arr[cur+1]=arr[cur];
                }else{
                    //找到合适的位置了
                    break;
                }
            }
            //此时cur位置的元素小于v，所以将v插入到cur位置元素的后面
            arr[cur+1]=v;
        }
    }
    //希尔排序
    //
    public static void shellSort(int[] arr){
        int gap=arr.length/2;
        while (gap>=1){
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
    //选择排序
    public static void selectSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=bound+1;cur<arr.length;cur++){
                if(arr[bound]>arr[cur]){
                   swap(arr,bound,cur);
                }
            }
        }
    }
    //堆排序
    public static void heapSort(int[] arr){
        creatHeap(arr);
        int heapSize=arr.length;
        while (heapSize>0) {
            swap(arr,0,heapSize-1);
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
            if(arr[parent]<arr[child]){
                swap(arr,parent,child);
            }else{
                break;
            }
            parent=child;
            child=parent*2+1;
        }
    }

    //建堆，向下调整
    public static void creatHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=arr.length-1;cur>bound;cur--){
                if(arr[cur]<arr[cur-1]){
                    swap(arr,cur,cur-1);
                }
            }
        }
    }
    //快速排序
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

    public static int partition(int[] arr, int left, int right) {
        //将最右边的元素选取作为基准值
        int v=arr[right];
        int i=left;
        int j=right-1;
        while(i<j){
            //从左到右找到一个比基准值大的
            while(i<j && arr[i]<=v){
                i++;
            }
            //从右到左找到一个比基准值小的
            while(i<j && arr[j]>=v){
                j--;
            }
            swap(arr,i,j);
        }
        //如果发现i和j位置重合了，就交换基准值和重合的位置
        swap(arr,i,right);
        return i;
    }
    //非递归版快速排序
    public static void quickSort2(int[] arr){
        //创建一个栈，栈里面存放要去处理的区间
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
            //把得到的子区间再入栈
            stack.push(index+1);
            stack.push(end);

            stack.push(beg);
            stack.push(index-1);
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,8};
        quickSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package Pra0324;
import java.util.Arrays;
import java.util.Stack;

//各种排序算法，均以升序为例
public class Sort {
    //插入排序
    //已排序区间[0,bound),待排序区间[bound,length-1]
    //拿出待排序区间的第一个元素v
    //从已排序区间的末尾开始比较，找到待排序区间的元素插入的合适位置
    //以升序为例，如果v小于以排序区间的某个元素，那么将那个元素往后挪
    //留出v插入的位置
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
    //希尔排序
    //希尔排序就是要选取一个gap，通过这个gap进行分组，分gap个组
    //因为插入排序有个重要的特性，分组越小，效率越高；分组越有序，效率越高
    //针对这两个性质，希尔排序将分组划分为小分组进而整理成相对有序的数组
    //对于划分的小分组进行插入排序
    public static void shellSort(int[] arr){
        int gap=arr.length/2;
        while(gap>0){
            _shellSort(arr,gap);
            gap/=2;
        }
    }
    public static void _shellSort(int[] arr,int gap){
        for(int bound=gap;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-gap;
            for(;cur>=0;cur-=gap) {
                if(v<arr[cur]){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap]=v;
        }
    }
    //选择排序，也就是打擂台排序
    //已排区间[0,bound),待排区间[bound,length-1]
    //bound也就是待排区间的第一个元素处为擂台，依次向后遍历
    //分别和擂台上的元素进行比较，符合要求的留在擂台上（交换）
    //每趟比较，都会找到待排区间的一个最值
    public static void selectSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=bound+1;cur<arr.length;cur++){
                if(arr[cur]<arr[bound]){
                    swap(arr,bound,cur);
                }
            }
        }
    }
    //堆排序，可以看成是对选择排序的优化
    //首先建堆，循环进行堆顶元素和最后一个元素交换的过程，并且删除这个元素
    //向下调整
    public static void heapSort(int[] arr){
        //首先建堆
        creatHeap(arr);
        int heapSize=arr.length;
        for(int i=0;i<arr.length;i++){
            //将堆顶元素和最后一个元素交换
            swap(arr,0,heapSize-1);
            heapSize--;
            //向下调整
            shiftDown(arr,heapSize,0);
        }
    }
    //由于是建大堆
    //所以向下调整就是从当前的位置出发，找到左右子树中较大的那个，让cur指向
    //并且和parent进行比较，如果child大于parent，那么交换这两个位置的元素
    public static void shiftDown(int[] arr,int size,int index){
        int parent=index;
        int child=parent*2+1;//左孩子
        while(child<size){
            if(child+1<size&&arr[child+1]>arr[child]){
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
    public static void creatHeap(int[] arr){
        if(arr.length<=1){
            return;
        }
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
    //找到一个基准值，将比基准值大的元素放到基准值的后面
    //比基准值小的，放到基准值的前面
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }
    public static void _quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        //index就是left和right重合的位置
        int index=partition(arr,left,right);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);

    }
    public static int partition(int[] arr,int left,int right){
        //选取基准值
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
            //交换
            swap(arr,i,j);
        }
        //如果发现i和j位置重合了，就交换基准值和重合的位置
        swap(arr,i,right);
        return i;
    }
    //快速排序的非递归实现方法
    //创建一个栈。也就相当于栈的非递归先序遍历
    public static void quickSort2(int[] arr){
        //创建一个栈，栈里面存放要去处理的区间，
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
    public static void swap(int[] arr,int n1,int n2){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
    public static void main(String[] args) {
        int[] arr={5,2,7,3,6,8};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

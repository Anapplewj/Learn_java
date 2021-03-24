package Pra0323;

import java.util.Arrays;

public class MyPriorityQueue {
    //向下调整，除了根节点之外，左右子树均满足堆的规则，以大堆为例
    //arr表示我们当前需要进行调整的数组
    //size表示数组实际存储元素的个数
    //index表示开始调整的位置
    public static void shiftDown(int[] arr,int size,int index){
        int parent=index;
        //child总是指向左右孩子中较大的那个值，初始条件下先让child指向左孩子
        int child=parent*2+1;
        while(child<size){
            //左右孩子的下标差1，child+1表示右孩子
            if(child+1<size && arr[child]<arr[child+1]){
                child=child+1;
            }
            if(arr[parent]<arr[child]){
                int temp=arr[parent];
                arr[parent]=arr[child];
                arr[child]=temp;
            }else{
                //调整完毕了
                break;
            }
            parent=child;
            child=2*parent+1;
        }
    }
    public static void build(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }
    //向上调整
    public static void shiftUp(int[] arr,int size,int index){
        int child=index;
        int parent=(child-1)/2;
        while(child>0){
            if(arr[child]>arr[parent]){
                int temp=arr[child];
                arr[child]=arr[parent];
                arr[parent]=temp;
            }else{
                break;
            }
            child=parent;
            parent=(child-1)/2;
        }
    }
    public int[] data=new int[1000];
    public int size=0;
    public MyPriorityQueue(int[] data,int size){
        this.size=size;
        for(int i=0;i<size;i++){
            this.data[i]=data[i];
        }
    }
    //基于向上调整建堆
    public static void build2(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            shiftUp(arr,arr.length,i);
        }
    }

    //插入元素
    public void offer(int val){
        if(size>=data.length){
            return;
        }
        data[size]=val;
        size++;
        shiftUp(data,size,size-1);
    }
    //获取堆顶元素
    public Integer peek(int[] arr){
        if(size==0){
            return null;
        }
        return arr[0];
    }
    //删除堆顶元素
    public Integer poll(){
        if(size==0){
            return null;
        }
        Integer ret=data[0];
        data[0]=data[size-1];
        size--;
        shiftDown(data,size,0);
        return ret;
    }
    public static void main(String[] args) {
        int[] arr={4, 9, 5, 2, 7, 3, 6, 8};
        build(arr);
        System.out.println(Arrays.toString(arr));
        MyPriorityQueue myPriorityQueue=new MyPriorityQueue(arr,8);
        myPriorityQueue.offer(10);
        System.out.println(myPriorityQueue.toString());
        myPriorityQueue.poll();
        System.out.println(myPriorityQueue.toString());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i < size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

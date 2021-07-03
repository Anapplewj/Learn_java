package Pra0626.TestPriorityQueue;

import java.util.Arrays;

//基于向下调整建大堆
public class MyPriorityQueue {
    //向下调整,建立大堆,找到左右子树中较大的那个值父节点比较
    private static void shiftDown(int[] arr,int size,int index){
        int parent=index;
        int child=index*2+1;
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
    private static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    private static void upDown(int[] arr,int size,int index){
        int child=index;
        int parent=(child-1)/2;
        while(child>0){
            if(arr[parent]>arr[child]){
                break;
            }else{
                swap(arr,child,parent);
            }
            child=parent;
            parent=(child-1)/2;
        }
    }

    public static void main(String[] args) {
        int[] arr={0,5,3,1,2,9,5,2,7};
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
        System.out.println(Arrays.toString(arr));
    }
}

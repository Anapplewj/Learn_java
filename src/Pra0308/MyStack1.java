package Pra0308;
//顺序表实现
//尾插尾删
public class MyStack1 {
    private int[] arr=new int[100];
    private int size=0;
    //入栈
    public void push(int val){
        if(size>=arr.length){
            return;
        }
        arr[size]=val;
        size++;
    }
    //出栈
    public Integer pop(){
        if(size==0){
            return null;
        }
        int ret=arr[size-1];
        size--;
        return ret;
    }
    //取出栈顶元素
    public Integer get(){
        if(size==0){
            return null;
        }
        int ret=arr[size-1];
        size--;
        return ret;
    }
}

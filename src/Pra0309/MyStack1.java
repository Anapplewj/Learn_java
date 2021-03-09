package Pra0309;
//顺序表实现栈
//栈的特点是尾进尾出，也就是从那边进，就从哪边出，
// 使用尾插尾删比较方便，头插头删的效率较低
public class MyStack1 {
    private int[] data=new int[100];
    private int size=0;
    //入栈
    public void push(int val){
        if(size>=data.length){
            return;
        }
        data[size]=val;
        size++;
    }
    //出栈
    public Integer pop(){
        if(size==0){
            return null;
        }
        int ret=data[size-1];
        size--;
        return ret;
    }

    //取栈顶元素
    public Integer peek(){
        if(size==0){
            return null;
        }
        return data[size-1];
    }
}

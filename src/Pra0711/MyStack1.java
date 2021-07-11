package Pra0711;

public class MyStack1 {
    private int[] data=new int[100];
    private int size=0;

    public void push(int val){
        if(size>=data.length){
            return;
        }
        data[size]=val;
        size++;
    }

    public Integer pop(){
        if(size==0){
            return null;
        }
        int result=data[size-1];
        size--;
        return result;
    }

    public Integer peek(){
        if(size==0){
            return null;
        }
        return data[size-1];
    }
}

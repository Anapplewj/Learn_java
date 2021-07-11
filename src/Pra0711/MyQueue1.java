package Pra0711;

//使用顺序表,环形链表实现
public class MyQueue1 {
    private int[] data=new int[5];
    private int size=0;
    private int head=0;
    private int tail=0;

    public boolean offer(int val){
        if(size>=data.length){
            return false;
        }
        data[tail]=val;
        tail=(tail+1)%data.length;
        size++;
        return true;
    }

    public Integer poll(){
        if(size==0){
            return null;
        }
        int result=data[head];
        head=(head+1)%data.length;
        size--;
        return result;
    }

    public Integer peek(){
        if(size==0){
            return null;
        }
        return data[head];
    }
}

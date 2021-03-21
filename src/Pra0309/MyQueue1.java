package Pra0309;
//用顺序表实现队
//队的特点是先进先出，从哪边进，就从另一边出
//所以在用顺序表实现的时候，两个引用记录顺序表的头，和顺序表的尾
//采用环形顺序表，伴随着出队列，顺序表的前面有了一些空间，当到达顺序表的末尾时
//返回到顺序表的前面，继续给剩余的空间差入
//再用一个引用记录存储的元素的个数
public class MyQueue1 {
    private int[] data=new int[100];
    private int head=0;
    private int tail=0;
    private int size=0;
    //入队
    public boolean offer(int val){
        if(size==data.length){
            return false;
        }
        data[tail]=val;
        tail++;
        size++;
        if(tail==data.length){
            tail=0;
        }
        return true;
    }
    //出队
    public Integer poll(){
        if(size==0){
            return null;
        }
        int ret=data[head];
        head++;
        size--;
        if(head==data.length){
            head=0;
        }
        return ret;
    }
    //取队首元素
    public Integer peek(){
        if(size==0){
            return null;
        }
        return data[head];
    }
}

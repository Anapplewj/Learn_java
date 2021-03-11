package Pra0311;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//用两个队列实现栈
class MyStack {
    private Queue<Integer> A=new LinkedList<>();
    private Queue<Integer> B=new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    //入栈
    public void push(int x) {
        A.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    //出栈
    //栈中，出栈是将后进的先出了
    //而队列中出队列是将先进的先出了
    //那么现在队尾的元素也就是我们首先要出栈的元素
    //如何得到这个队尾元素呢
    public int pop() {
        if(A.isEmpty()&&B.isEmpty()){
            return 0;
        }
        while(A.size()>1){
            int ret=A.poll();
            B.offer(ret);
        }
        int result=A.poll();
        //再将A和B交换
        Queue<Integer> c=new LinkedList<>();
        c=A;
        A=B;
        B=c;
        return result;
    }

    /** Get the top element. */
    //取栈顶元素
    //也就是将队尾的元素获取到
    public int top() {
        if(A.isEmpty()&&B.isEmpty()){
            return 0;
        }
        while(A.size()>1){
            int ret=A.poll();
            B.offer(ret);
        }
        int result=A.poll();
        B.offer(result);
        Queue<Integer> c=new LinkedList<>();
        c=A;
        A=B;
        B=c;
        return result;
    }

    /** Returns whether the stack is empty. */
    //判断栈是否空
    //也就是判断栈里面还有没有元素
    public boolean empty() {
        return A.isEmpty();
    }
}
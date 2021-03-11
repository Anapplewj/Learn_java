package Pra0311;

import java.util.Stack;

//用两个栈实现队列
class MyQueue {
    Stack<Integer> A=new Stack<>();
    Stack<Integer> B=new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    //入队
    public void push(int x) {
        A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    //出队
    //出队的元素，也就是栈底的元素
    //所以我们只需要获取到栈底元素即可
    public int pop() {
        if(A.isEmpty()&&B.isEmpty()){
            return 0;
        }
        while(!A.isEmpty()){
            int ret=A.pop();
            B.push(ret);
        }
        int result=B.pop();
        while(!B.isEmpty()){
            int ret=B.pop();
            A.push(ret);
        }
        return result;
    }

    /** Get the front element. */
    //获取队首元素
    //队首元素也就是栈底元素
    public int peek() {
        if(A.isEmpty()&&B.isEmpty()){
            return 0;
        }
        while(!A.isEmpty()){
            int ret=A.pop();
            B.push(ret);
        }
        int result=B.peek();
        while(!B.isEmpty()){
            int ret=B.pop();
            A.push(ret);
        }
        return result;
    }

    /** Returns whether the queue is empty. */
    //判断队是否为空
    public boolean empty() {
        return A.isEmpty();
    }
}

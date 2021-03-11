package Pra0311;

import java.util.Stack;

//实现一个最小栈
//创建栈A，栈B
//栈A中保存入栈的值，栈B中保存当前最小元素
//如果A和B都为空，那么将这个元素均入栈A和B中
//如果A非空，那么先用当前的元素和B的栈顶元素比较，
// 如果比B的栈顶元素小，那么将这个元素均入到A和B中
//如果比B的栈顶元素大，那么只需将这个元素入到A中即可
//如果A需要出栈，那么比较A和B的栈顶元素是否相同，如果相同，就将两个都出栈
class MinStack {
    Stack<Integer> A=new Stack<>();
    Stack<Integer> B=new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }
    //入栈
    public void push(int x) {
        if(A.isEmpty()&&B.isEmpty()){
            A.push(x);
            B.push(x);
            return;
        }
        int pB=B.peek();
        if(x<=pB){
            A.push(x);
            B.push(x);
            return;
        }else{
            A.push(x);
        }
    }
    //出栈,删除栈顶元素
    public void pop() {
        if(A.isEmpty()){
            return;
        }
        int pA=A.peek();
        int pB=B.peek();
        if(pA==pB){
            B.pop();
        }
        A.pop();
    }
    //获取栈顶元素
    public int top() {
        if(A.isEmpty()){
            return 0;
        }
        return A.peek();
    }

    public int getMin() {
        if(B.isEmpty()){
            return 0;
        }
        return B.peek();
    }
}
package Pra0401;

import java.util.Stack;

class MinStack {
    public static Stack<Integer> stack=null;
    public static Stack<Integer> stack2=null;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(stack2.isEmpty()){
            stack2.push(x);
        }else if(x<stack2.peek()){
            stack2.push(x);
        }
    }

    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        if(!stack2.isEmpty() && stack.peek()==stack2.peek()){
            stack2.pop();
        }
        stack.pop();
    }

    public int top() {
        if(stack.isEmpty()){
            return 0;
        }
        return stack.peek();
    }

    public int min() {
        if(stack2.isEmpty()){
            return 0;
        }
        return stack2.peek();
    }
}
public class MyStack{
    public static void main(String[] args) {
        MinStack stack=new MinStack();
        stack.push(1);
        stack.push(0);
        stack.push(100);
        stack.push(-3);
        System.out.println("stack.min: "+stack.min());
        stack.pop();
        System.out.println("stack.top: "+stack.top());
        System.out.println("stack.min: "+stack.min());
    }
}
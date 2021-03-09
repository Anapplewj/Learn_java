package Pra0309;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Queue q=new LinkedList();
        q.offer(1);
        q.add(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
//        Stack s=new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.peek());//如果栈为空，就会抛出异常
//        MyStack1 myStack1=new MyStack1();
//        myStack1.push(1);
//        myStack1.push(2);
//        myStack1.push(3);
//        myStack1.push(4);
//        System.out.println(myStack1.pop());
//        System.out.println(myStack1.peek());
//        MyStack2 myStack2=new MyStack2();
//        myStack2.push(1);
//        myStack2.push(2);
//        myStack2.push(3);
//        myStack2.push(4);
//        System.out.println(myStack2.pop());
//        System.out.println(myStack2.pop());
//        System.out.println(myStack2.pop());
//        System.out.println(myStack2.peek());
//        System.out.println(myStack2.pop());
//        System.out.println(myStack2.pop());
//        MyQueue1 q1=new MyQueue1();
//        q1.offer(1);
//        q1.offer(2);
//        q1.offer(3);
//        q1.offer(4);
//        System.out.println(q1.poll());
//        System.out.println(q1.poll());
//        System.out.println(q1.poll());
//        System.out.println(q1.peek());
//        System.out.println(q1.poll());
//        System.out.println(q1.peek());
//        MyQueue2 q2=new MyQueue2();
//        q2.offer(1);
//        q2.offer(2);
//        q2.offer(3);
//        q2.offer(4);
//        System.out.println(q2.peek());
//        System.out.println(q2.poll());
//        System.out.println(q2.poll());
//        System.out.println(q2.poll());
//        System.out.println(q2.poll());
//        System.out.println(q2.peek());
    }
}

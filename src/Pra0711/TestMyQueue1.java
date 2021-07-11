package Pra0711;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestMyQueue1 {
    public static void main(String[] args) {
        MyQueue1 queue=new MyQueue1();
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

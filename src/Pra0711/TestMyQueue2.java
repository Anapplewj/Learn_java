package Pra0711;

public class TestMyQueue2 {
    public static void main(String[] args) {
        MyQueue2 queue=new MyQueue2();
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

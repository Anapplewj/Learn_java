package Pra0711;

public class TestMyStack2 {
    public static void main(String[] args) {
        MyStack2 stack=new MyStack2();
        System.out.println(stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
    }
}

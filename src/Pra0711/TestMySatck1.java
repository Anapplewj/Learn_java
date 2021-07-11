package Pra0711;

public class TestMySatck1 {
    public static void main(String[] args) {
        MyStack1 stack=new MyStack1();
        System.out.println(stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
    }
}

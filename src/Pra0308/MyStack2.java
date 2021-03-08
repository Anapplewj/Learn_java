package Pra0308;
//使用链表实现
//头插头删
public class MyStack2 {
    static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    private Node head=null;
    //入栈
    public void push(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
    //出栈
    public Integer pop(){
        if(head==null){
            return null;
        }
        int ret=head.val;
        head=head.next;
        return ret;
    }
    //取到栈顶元素
    public Integer get(){
        if(head==null){
            return null;
        }
        return head.val;
    }
}

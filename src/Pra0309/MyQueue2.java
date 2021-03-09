package Pra0309;
//使用链表实现队列
//队的特点是，先进先出，也就是从一边进，从另一边出
//使用尾进，头出
public class MyQueue2 {
    static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    private Node head=null;
    private Node tail=null;
    //入队
    public void offer(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=tail.next;
    }
    //出队
    public Integer poll(){
        if(head==null){
            return null;
        }
        int ret=head.val;
        head=head.next;
        return ret;
    }
    //取队首元素
    public Integer peek(){
        if(head==null){
            return null;
        }
        return head.val;
    }
}

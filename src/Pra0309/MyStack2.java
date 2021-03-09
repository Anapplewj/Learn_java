package Pra0309;
//使用链表实现栈
//栈的特点是从哪边进，就从哪边出
//链表实现的话头插头删比较方便，尾插尾删要记录额外的信息
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
            return;
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

    //取栈顶元素
    public Integer peek(){
        if(head==null){
            return null;
        }
        return head.val;
    }

}

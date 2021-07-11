package Pra0711;

public class MyQueue2 {
    static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head=null;
    Node tail=null;

    public void offer(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }

    public Integer poll(){
        if(head==null){
            return null;
        }
        int result=head.val;
        head=head.next;
        return result;
    }

    public Integer peek(){
        if(head==null){
            return null;
        }
        return head.val;
    }
}

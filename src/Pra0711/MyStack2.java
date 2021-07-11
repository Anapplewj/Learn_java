package Pra0711;

public class MyStack2 {
    static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "[" +val +"]";
        }
    }
    private Node head=null;

    public void push(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
    }

    public Integer pop(){
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

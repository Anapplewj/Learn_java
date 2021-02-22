package Pra0222;
class Node{
    int val;
    Node next;
    public Node(int val){
       this.val=val;
    }
}
public class Test {
   //初始化一个链表
   public static Node init(){
       Node node1=new Node(1);
       Node node2=new Node(2);
       Node node3=new Node(3);
       Node node4=new Node(4);
       node1.next=node2;
       node2.next=node3;
       node3.next=node4;
       node4.next=null;
       return node1;
   }
   //打印一个链表
    public static void print(Node head){
       for(Node cur=head;cur!=null;cur=cur.next){
           System.out.print(cur.val+" ");
       }
        System.out.println();
    }
   //链表逆置
    public static Node reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node prevNode=null;
        Node curNode=head;
        Node newHead=null;
        for(;curNode!=null;){
            Node nextNode=curNode.next;
            if(curNode.next==null){
                newHead=curNode;
            }
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        return newHead;
    }
   public static void main(String[] args) {
       Node head=init();
       //逆置前
       print(head);
       //逆置后
       head=reverse(head);
       print(head);
   }
}

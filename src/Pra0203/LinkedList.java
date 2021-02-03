package Pra0203;

public class LinkedList {
    public static Node createList1(){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return a;
    }
    public static Node createList2(){
        Node dummy=new Node(0);
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        dummy.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return dummy;
        //所谓带傀儡节点的链表
        // 只不过就是把一个不实际存储数据的节点放到了链表最开头而已
        //这个节点就叫做傀儡节点，里面的值随便存，反正也不会去取这个值
    }
    //遍历不带傀儡节点的链表
    public static void print1(Node head){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.print(cur);
        }
    }
    //遍历带傀儡节点的链表
    public static void print2(Node head){
        for(Node cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur);
        }
    }
    //尾插一个节点
    public static Node insert(Node head,int val){
        //如果是一个空链表
        if(head==null){
            return new Node(val);
        }
        //非空
        Node prev=head;
        Node newNode=new Node(val);
        for(;prev.next!=null;prev=prev.next){
        }
        newNode.next=null;//newNode.next=prev.next;
        prev.next=newNode;
        return head;
    }
    //按照值删除元素(无法删除首元素)
    //首先找到被删节点的前一个节点
    //然后直接让前一个节点的next，存被删元素的下一个节点的地址
    public static void remove1(Node head,int val){
        Node prev=head;  
        for(;prev!=null
                &&prev.next!=null
                &&prev.next.next!=null;prev=prev.next){
            if(prev.next.val==val){
                break;
            }
        }
        if(prev==null||prev.next==null){
            return;
        }
        prev.next = prev.next.next;
    }
    public static void main(String[] args) {
        Node head=createList1(); //不带傀儡节点的链表
        Node head2=createList2();//带傀儡节点的链表
        Node node=insert(head,5);
        print1(node);
        remove1(head,1);
        print1(node);
        //插入元素到链表中间
        //插入元素到链表尾

        //删除链首元素
        //删除链中间元素
        //删除链末尾元素
    }
}

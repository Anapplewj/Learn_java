package Pra0209;
//在这里的删除插入都是针对没有傀儡节点的链表
public class LinkedList {
    //创建一个链表
    public static Node link(){
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
    //遍历一个没有傀儡节点的链表
    public static void printNode(Node head){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.print(cur);
        }
        System.out.println();
    }
    //头插
    public static Node add1(Node head,int val){
        Node newNode=new Node(val);
        if(head==null){
            newNode.next=null;
            return newNode;
        }
        //head相当于链表首节点的别称，是一个引用，里面保存的是首节点的地址
        newNode.next=head;
        head=newNode;
        return head;
    }
    //中间插,给定前驱结点，中插尾插皆可
    public static Node add2(Node head,int val,int newval){
        Node newNode=new Node(newval);
        if(head==null){
            return null;
        }
        Node prev=head;
        for(;prev!=null&&prev.next!=null;prev=prev.next){
            if(prev.next.val==val){
                break;
            }
        }
        if(prev==null||prev.next==null){
            return head;
        }
        newNode.next=prev.next;
        prev.next=newNode;
        return head;
    }
    //尾插
    public static Node add3(Node head,int val){
        Node newNode=new Node(val);
        if(head==null){
            return newNode;
        }
        //先找到最后一个元素,最后有一个节点的next为null
        Node cur=head;
        for(;cur!=null&&cur.next!=null;cur=cur.next){
        }
        newNode.next=cur.next;
        cur.next=newNode;
        return head;
    }
    //删除头节点
    public static Node remove1(Node head){
        if(head==null||head.next==null){
            return null;
        }
        head=head.next;
        return head;
    }
    //按照值删除
    public static Node remove2(Node head,int val){
        //找到这个值对应节点的前驱节点
        Node prev=head;
        for(;prev!=null&&prev.next!=null;prev=prev.next){
            if(prev.next.val==val){
                break;
            }
        }
        if(prev==null||prev.next==null){
            return head;
        }
        prev.next=prev.next.next;
        return head;
    }
    //给定节点位置删除
    public static Node remove3(Node head,Node toDelete){
        if(head==null){
            return null;
        }
        if(toDelete==head){
            head=head.next;
            return head;
        }
        Node prev=head;
        for(;prev!=null&&prev.next!=null;prev=prev.next){
            if(prev.next==toDelete){
                break;
            }
        }
        if(prev==null||prev.next==null){
            return head;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static int size(Node head){
        int count=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            count++;
        }
        return count;
    }
    //给定元素下标删除
    public static Node remove4(Node head,int pos){
        if(pos<0||pos>=size(head)){
            return head;
        }
        if(pos==0){
            head=head.next;
            return head;
        }
        Node prev=head;
        for(int i=1;i<pos;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head=link();
        printNode(head);
        head=add1(head,0);//头插
        printNode(head);
        head=add2(head,2,10);//已知前一个节点，插入
        printNode(head);
        head=add3(head,5);//尾插
        printNode(head);
        head=remove1(head);//删除头节点
        printNode(head);
        head=remove2(head,5);
        printNode(head);
        head=remove4(head,4);
        printNode(head);

    }
}

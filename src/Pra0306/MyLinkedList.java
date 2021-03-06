package Pra0306;

//双向链表
//实现链表的增删改查
class Node{
    int val;
    Node prev=null;
    Node next=null;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" +val +"]";
    }
}
public class MyLinkedList {

    //记录链表的头节点
    // 尾节点
    //链表的长度
    private Node head;
    private Node tail;
    private int length=0;

    public MyLinkedList() {
        head=null;
        tail=null;
    }
    //获取链表当前的节点个数
    public int getLength() {
        return length;
    }
    //插入元素
    //头插
    public void addFirst(int val){
        Node newNode=new Node(val);
        //链表为空的情况
        if(head==null){
            head=newNode;
            tail=newNode;
            length++;
            return;
        }
        //链表不为空的情况
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        length++;
    }
    //尾插
    public void addLast(int val){
        Node newNode=new Node(val);
        //链表为空的情况
        if(head==null){
            head=newNode;
            tail=newNode;
            length++;
            return;
        }
        //非空
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        length++;
    }
    //指定位置插入
    public void add(int index,int val){
        if(index<0||index>=length){
            return;
        }
        Node newNode=new Node(val);
        //找到新节点应该插入位置的前一个结点和后一个节点
        Node nextNode=getNode(index);
        Node prevNode=nextNode.prev;
        prevNode.next=newNode;
        newNode.prev=prevNode;
        newNode.next=nextNode;
        nextNode.prev=newNode;
        length++;
    }
    //删除元素
    //头删
    public void removeFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            length=0;
            return;
        }
        head=head.next;
        head.prev=null;
        length--;
    }
    //尾删
    public void removeLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            length=0;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        length--;
    }
    //指定位置删
    public void removeByIndex(int index){
        if(index<0||index>=length){
            return;
        }
        if(index==0){
            removeFirst();
            return;
        }
        if(index==length-1){
            removeLast();
            return;
        }
        Node curNode=getNode(index);
        Node preNode=curNode.prev;
        Node nextNode=curNode.next;
        preNode.next=nextNode;
        nextNode.prev=preNode;
        length--;
    }
    //指定值删
    public void removeByValue(int val){
        int index=indexOf(val);
        if(index==-1){
            return;
        }
        removeByIndex(index);
    }
    //查找指定下标的节点
    public Node getNode(int index){
        if(index<0||index>=length){
            return null;
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }
    //查找指定下标的节点的值
    public int get(int index){
        if(index<0||index>=length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return getNode(index).val;
    }
    //查找指定值的节点的下标
    public int indexOf(int val){
        int index=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            if(cur.val==val){
                return index;
            }
            index++;
        }
        return -1;
    }
    //修改
    public void set(int index,int val){
        if(index<0||index>=length){
            throw new ArrayIndexOutOfBoundsException();
        }
        getNode(index).val=val;
    }
    //打印链表
    public void printLinkedList(){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.print(cur);
        }
        System.out.println();
    }
}

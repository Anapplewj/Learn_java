package Pra0307;
//库中的链表是双向链表
//自己实现LinkedList
class Node{
    int val;
    Node prev;
    Node next;
    public Node(int val) {
        this.val = val;
    }
    @Override
    public String toString() {
        return "[" +val +"]";
    }
}
public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length=0;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int getLength() {
        return length;
    }

    //插入元素
    //头插
    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null) {
            head = newNode;
            tail = newNode;
            length = 1;
            return;
        }else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
            length++;
        }
    }
    //尾插
    public void addLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
            length++;
            return;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            length++;
        }
    }
    //中间位置插入
    public void add(int index,int val){
        if(index==0){
            addFirst(val);
            return;
        }
        if(index==length){
            addLast(val);
            return;
        }
        Node newNode=new Node(val);
        Node nextNode=getNode(index);
        if(nextNode==null){
            return;
        }
        Node preNode=nextNode.prev;
        newNode.prev=preNode;
        preNode.next=newNode;
        newNode.next=nextNode;
        nextNode.prev=newNode;
        length++;
    }
    //删除节点
    //头删
    public void removeFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            length--;
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
            length--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        length--;
    }
    //按照位置删
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
        Node toRemove=getNode(index);
        Node prevNode=toRemove.prev;
        Node nextNode=toRemove.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        length--;
    }
    //按照值删
    public void removeByValue(int val){
        if(indexOf(val)==-1){
            return;
        }
        int index=indexOf(val);
        removeByIndex(index);
    }

    //得到指定位置的节点
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
    //修改元素
    public void set(int index,int val){
        if(index<0||index>=length){
            return;
        }
        getNode(index).val=val;
    }
    //通过下标，得到指定位置节点的值
    public int get(int index){
        if(index<0||index>=length){
            return -1;
        }else{
            return getNode(index).val;
        }
    }
    //通过值，找到下标
    public int indexOf(int val){
        for(int i=0;i<length;i++){
            if(get(i)==val){
                return i;
            }
        }
        return -1;
    }
    public void printLinkedList(){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.print(cur);
        }
        System.out.println();
    }
}

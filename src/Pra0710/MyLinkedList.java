package Pra0710;
//实现双向链表
public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length=0;

    public MyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public int getLength(){
        return length;
    }

    //头插
    public void addFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    //尾插,链表不为空
    public void addLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    //中间位置插入
    public void add(int val,int index){
        if(index==0){
            addFirst(val);
            return;
        }
        if(index==length){
            addLast(val);
            return;
        }
        Node nextNode= getNode(index);
        if(nextNode==null){
            return;
        }
        Node curNode=new Node(val);
        Node prevNode=nextNode.prev;
        prevNode.next=curNode;
        curNode.prev=prevNode;
        curNode.next=nextNode;
        nextNode.prev=curNode;
        length++;
    }

    //找到指定位置的节点
    public Node getNode(int index){
        if (index<0||index>=length){
            return null;
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }
    //查找指定位置节点的值
    public int get(int index){
        if (index<0||index>=length){
            return -1;
        }else{
            return getNode(index).val;
        }
    }
    //通过值,找到节点的下标
    public int indexOf(int val){
        for(int i=0;i<length;i++){
            if (get(i)==val){
                return i;
            }
        }
        return -1;
    }
    //头删
    public void removeFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
        }else {
            head=head.next;
            head.prev=null;
        }
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
        }else{
            tail=tail.prev;
            tail.next=null;
        }
        length--;
    }
    //按照位置删
    public void removeByIndex(int index){
        if(index==0){
            removeFirst();
        }else if(index==length-1){
            removeLast();
        }else if(index<0||index>=length){
            return;
        }else{
            Node curNode=getNode(index);
            Node prevNode=curNode.prev;
            Node nextNode=curNode.next;
            prevNode.next=nextNode;
            nextNode.prev=prevNode;
            length--;
        }
    }
    //按照值删
    public void removeByValue(int val){
        if(indexOf(val)==-1){
            return;
        }
        int index=indexOf(val);
        removeByIndex(index);
    }
    //修改元素
    public void set(int val,int index){
        if(index<0||index>=length){
            return;
        }
        getNode(index).val=val;
    }
}

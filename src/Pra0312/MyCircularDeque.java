package Pra0312;
//设计一个循环双端队列
//使用链表实现

class MyCircularDeque {
    static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    Node head=null;
    Node tail=null;
    int capacity=0;
    int size=0;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.capacity=k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        Node newNode=new Node(value);
        if(size>=capacity){
            return false;
        }
        if(size==0&&head==null){
            head=newNode;
            tail=newNode;
            size++;
            return true;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        Node newNode=new Node(value);
        if(size>=capacity){
            return false;
        }
        if(size==0&&head==null){
            head=newNode;
            tail=newNode;
            size++;
            return true;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(size<=0&&head==null){
            return false;
        }
        if(head.next==null){
            head=null;
            tail=null;
            size=0;
            return true;
        }
        head=head.next;
        head.prev=null;
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(size<=0&&head==null){
            return false;
        }
        if(head.next==null){
            head=null;
            tail=null;
            size=0;
            return true;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(size<=0&&head==null){
            return -1;
        }
        return head.val;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(size<=0&&head==null){
            return -1;
        }
        return tail.val;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(size==0&&head==null){
            return true;
        }
        return false;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(size==capacity){
            return true;
        }
        return false;
    }
}


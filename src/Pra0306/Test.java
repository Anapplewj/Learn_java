package Pra0306;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        //验证插入操作
        myLinkedList.addFirst(0);
        myLinkedList.addLast(2);
        myLinkedList.add(1,1);
        myLinkedList.printLinkedList();
        //验证删除操作
//        myLinkedList.removeFirst();
//        myLinkedList.removeLast();
//        myLinkedList.removeByIndex(1);
//        myLinkedList.removeByValue(0);
//        myLinkedList.printLinkedList();
        //验证修改
        myLinkedList.set(0,9);
        myLinkedList.printLinkedList();
    }

}
